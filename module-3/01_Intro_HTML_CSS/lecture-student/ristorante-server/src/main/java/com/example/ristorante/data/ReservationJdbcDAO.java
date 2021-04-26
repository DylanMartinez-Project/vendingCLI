package com.example.ristorante.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.example.ristorante.model.Reservation;

@Component
public class ReservationJdbcDAO implements ReservationDAO {

	private JdbcTemplate template;
	
	public ReservationJdbcDAO(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}
	
	/**
	 *
	 */
	@Override
	public List<Reservation> getAllReservations() {
		
		String sql = "SELECT * from reservations";
		
		SqlRowSet results = template.queryForRowSet(sql);		
		List<Reservation> allReservations = new ArrayList<Reservation>();
		
		while (results.next()) {

			String name = results.getString("name");
			int numGuests = results.getInt("number_quests");
			boolean special = results.getBoolean("specialOccasion");
			
			Reservation reservation = new Reservation();
			reservation.setReservationId(results.getLong("id"));
			reservation.setNumberOfGuests(results.getInt("number_quests"));
			reservation.setReservationDate("reservation_date");
			allReservations.add(reservation);
		}
		
		return allReservations;
		
	}

	@Override
	public void addReservation(Reservation reservation) {
		
		String dateStr = reservation.getReservationDate();
		
		int dateYr = Integer.parseInt(dateStr.substring(0,4));
		int dateMo = Integer.parseInt(dateStr.substring(5, 7));
		int dateDay = Integer.parseInt(dateStr.substring(8));
		
		LocalDate date = LocalDate.of(dateYr, dateMo, dateDay);
		
		String sql = "INSERT INTO reservations (name, number_guests, reservation_date, specialOccasion) values (?, ?, ?, ?)";
		template.update(sql, reservation.getReservationName(), reservation.getNumberOfGuests(), 
				date, reservation.isSpecialOccasion());
		
	}

}
