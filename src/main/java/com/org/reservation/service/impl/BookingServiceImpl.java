package com.org.reservation.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.reservation.model.ApiResponse;
import com.org.reservation.model.Offer;
import com.org.reservation.model.TicketBookedHistory;
import com.org.reservation.model.TrainDetails;
import com.org.reservation.repository.TicketBookedHistoryRepository;
import com.org.reservation.repository.TrainDetailRepository;
import com.org.reservation.service.BookingService;

import jakarta.transaction.Transactional;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private TrainDetailRepository trainDetailRepository;

	@Autowired
	private TicketBookedHistoryRepository trainBookRepository;

	@Override
	public List<TrainDetails> getTrainList() throws Exception {
		return trainDetailRepository.findAll();
	}

	@Override
	public ApiResponse getOffersByPlace(String place, String travelDateStr) throws Exception {
		ApiResponse apiResponse = new ApiResponse();
		List<Offer> list = trainDetailRepository.getOffers(place);
		if (!list.isEmpty()) {
			LocalDate travelDate = convertDate(travelDateStr, "yyyy-MM-dd");
			for (Offer offer : list) {
				LocalDate startDate = convertDate(offer.getOfferStartDate(), "dd-MM-yyyy");
				LocalDate endDate = convertDate(offer.getOfferEndDate(), "dd-MM-yyyy");
				boolean isInRange = isDateInRange(startDate, endDate, travelDate);
				if (isInRange) {
					apiResponse.setResponseCode(0);
					apiResponse.setResponseMsg("Offer is available");
					return apiResponse;
				}
			}

		}

		apiResponse.setResponseCode(1);
		apiResponse.setResponseMsg("Offer is not available");
		return apiResponse;
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public ApiResponse bookTicket(List<TicketBookedHistory> bookedList) throws Exception {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setResponseCode(0);
		apiResponse.setResponseMsg("Ticket Booked successfully");
		if (bookedList.isEmpty()) {
			apiResponse.setResponseCode(1);
			apiResponse.setResponseMsg("ticket details not found");
			return apiResponse;
		}
		bookedList.stream().forEach(ticketBookedHistory -> {
			trainBookRepository.save(ticketBookedHistory);
			updateTrainDetails(ticketBookedHistory, bookedList.size());
		});

		return apiResponse;
	}

	private void updateTrainDetails(TicketBookedHistory ticketBookedHistory, int totalBookedTickets) {
		Optional<TrainDetails> trainDetailsOptional = trainDetailRepository.findById(ticketBookedHistory.getTrainNo());
		if (trainDetailsOptional.isPresent()) {
			TrainDetails trainDetails = trainDetailsOptional.get();
			Integer pendingTicket = trainDetails.getTotalAvailableSeat() - totalBookedTickets;
			int x = trainDetailRepository.updateTainDetails(ticketBookedHistory.getTrainNo(), pendingTicket);
			System.out.println("Train details table is updated..." + x);
		}

	}

	private LocalDate convertDate(String date, String format) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return LocalDate.parse(date, formatter);
	}

	private boolean isDateInRange(LocalDate startDate, LocalDate endDate, LocalDate inputDate) {
		return (inputDate.isEqual(startDate) || inputDate.isAfter(startDate))
				&& (inputDate.isEqual(endDate) || inputDate.isBefore(endDate));
	}

}
