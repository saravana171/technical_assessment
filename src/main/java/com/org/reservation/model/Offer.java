package com.org.reservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFFER")
public class Offer {

	@Id
	@Column(name = "PLACE")
	private String place;

	@Column(name = "OFFER_START_DATE")
	private String offerStartDate;

	@Column(name = "OFFER_END_DATE")
	private String offerEndDate;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(String offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	public String getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(String offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

}
