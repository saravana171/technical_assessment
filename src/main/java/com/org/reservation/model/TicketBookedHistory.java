package com.org.reservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TICKET_BOOKED_HISTORY")
public class TicketBookedHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SEQNO")
	private Integer seqno;

	@Column(name = "TRAIN_NO")
	private Integer trainNo;

	@Column(name = "TRAIN_NAME")
	private String trainName;

	@Column(name = "STATION_FROM")
	private String stationFrom;

	@Column(name = "STATION_END")
	private String stationEnd;

	@Column(name = "PASSENGER_NAME")
	private String passengerName;

	@Column(name = "TICKET_AMT")
	private Integer ticketAmt;

	@Column(name = "TICKET_TYPE")
	private String ticketType;

	@Column(name = "TRAVEL_DATE")
	private String travelDate;

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getStationFrom() {
		return stationFrom;
	}

	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}

	public String getStationEnd() {
		return stationEnd;
	}

	public void setStationEnd(String stationEnd) {
		this.stationEnd = stationEnd;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getTicketAmt() {
		return ticketAmt;
	}

	public void setTicketAmt(Integer ticketAmt) {
		this.ticketAmt = ticketAmt;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

}
