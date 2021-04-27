package com.example.ristorante.model;

import java.time.LocalDate;

public class Reservation {
	
	private long reservationId;
	private String reservationName;
	private int numberOfGuests;
	private String reservationDate;
	private String reservationTime;
	private boolean specialOccasion;
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public boolean isSpecialOccasion() {
		return specialOccasion;
	}
	public void setSpecialOccasion(boolean specialOccasion) {
		this.specialOccasion = specialOccasion;
	}

	
	
}
