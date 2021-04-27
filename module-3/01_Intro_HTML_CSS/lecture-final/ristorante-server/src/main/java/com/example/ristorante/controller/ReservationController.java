package com.example.ristorante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ristorante.data.ReservationDAO;
import com.example.ristorante.model.Reservation;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationDAO dao;
	
	@RequestMapping(path="/get-all-reservations", method=RequestMethod.GET)
	public List<Reservation> getAllReservations() {
		
		return dao.getAllReservations();
	}
	
	@RequestMapping(path="/new-reservation", method=RequestMethod.POST)
	public @ResponseBody void addReservation(Reservation reservation) {
		
		dao.addReservation(reservation);
	}

}
