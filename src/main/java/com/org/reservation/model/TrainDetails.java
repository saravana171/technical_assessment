package com.org.reservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRAIN_DETAILS")
public class TrainDetails {

	@Id
	@Column(name = "TRAIN_NO")
	private Integer trainNo;

	@Column(name = "TRAIN_NAME")
	private String trainName;

	@Column(name = "STATION_FROM")
	private String stationFrom;

	@Column(name = "STATION_END")
	private String stationEnd;

	@Column(name = "TOTAL_AVAILABLE_SEAT")
	private Integer totalAvailableSeat;
	
	@Column(name = "COST_ADULT")
	private Integer costAdult;
	
	@Column(name = "COST_SENIOR")
	private Integer costSenior;
	
	@Column(name = "COST_CHILD")
	private Integer costChild;

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

	public Integer getTotalAvailableSeat() {
		return totalAvailableSeat;
	}

	public void setTotalAvailableSeat(Integer totalAvailableSeat) {
		this.totalAvailableSeat = totalAvailableSeat;
	}

	public Integer getCostAdult() {
		return costAdult;
	}

	public void setCostAdult(Integer costAdult) {
		this.costAdult = costAdult;
	}

	public Integer getCostSenior() {
		return costSenior;
	}

	public void setCostSenior(Integer costSenior) {
		this.costSenior = costSenior;
	}

	public Integer getCostChild() {
		return costChild;
	}

	public void setCostChild(Integer costChild) {
		this.costChild = costChild;
	}

	
}
