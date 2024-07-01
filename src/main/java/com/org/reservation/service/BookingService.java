package com.org.reservation.service;

import java.util.List;

import com.org.reservation.model.ApiResponse;
import com.org.reservation.model.TicketBookedHistory;
import com.org.reservation.model.TrainDetails;

public interface BookingService {

	public List<TrainDetails> getTrainList() throws Exception;

	public ApiResponse getOffersByPlace(String place, String travelDate) throws Exception;

	public ApiResponse bookTicket(List<TicketBookedHistory> bookedList) throws Exception;

}
