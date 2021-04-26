package com.example.ristorante.data;

import java.util.List;

import com.example.ristorante.model.Reservation;

public interface ReservationDAO {
	
	public List<Reservation> getAllReservations();
	
	public void addReservation(Reservation reservation);

}
