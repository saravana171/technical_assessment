package com.org.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.reservation.model.ApiResponse;
import com.org.reservation.model.TicketBookedHistory;
import com.org.reservation.model.TrainDetails;
import com.org.reservation.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@GetMapping("train/list")
	public List<TrainDetails> getTrainList() throws Exception {
		return bookingService.getTrainList();
	}

	@GetMapping("train/offer")
	public ApiResponse getOfferByPlace(@RequestParam(name = "place") String place,
			@RequestParam(name = "travelDate") String travelDate) throws Exception {
		return bookingService.getOffersByPlace(place, travelDate);
	}

	@PostMapping("book/ticket")
	public ApiResponse bookTicket(@RequestBody List<TicketBookedHistory> bookedList) throws Exception {
		return bookingService.bookTicket(bookedList);
	}

}
