package com.techelevator.hotels.services;

import com.techelevator.hotels.models.Hotel;
import com.techelevator.hotels.models.Reservation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class HotelService {

  public static String AUTH_TOKEN = "";
  private final String INVALID_RESERVATION_MSG = "Invalid Reservation. Please enter the Hotel Id, Full Name, Checkin Date, Checkout Date and Guests";
  private final String BASE_URL;
  private final RestTemplate restTemplate = new RestTemplate();
  private final ConsoleService console = new ConsoleService();

  public HotelService(String url) {
    BASE_URL = url;
  }

  /**
   * List all hotels in the system
   * @return
   */
  public Hotel[] listHotels() throws HotelServiceException {
    return null;
  }


  /**
   * Create a new reservation in the hotel reservation system
   * @param newReservation
   * @return Reservation
   */
  public Reservation addReservation(String newReservation) throws HotelServiceException {
    return null;
  }

  /**
   * Updates an existing reservation by replacing the old one with a new reservation
   * @param CSV
   * @return
   */
  public Reservation updateReservation(String CSV) throws HotelServiceException {
    return null;
  }

  /**
   * Delete an existing reservation
   * @param id
   */
  public void deleteReservation(int id) throws HotelServiceException {

  }


  /**
   * Creates a new {HttpEntity} with the `Authorization: Bearer:` header and a reservation request body
   * @param reservation
   * @return
   */
  private HttpEntity<Reservation> makeReservationEntity(Reservation reservation) {
    return null;
  }

  /**
   * Returns an {HttpEntity} with the `Authorization: Bearer:` header
   * @return {HttpEntity}
   */
  private HttpEntity makeAuthEntity() {
    return null;
  }







  /* DON'T MODIFY ANY METHODS BELOW */



  /**
   * Get the details for a single hotel by id
   * @param id
   * @return Hotel
   */
  public Hotel getHotel(int id) throws HotelServiceException {
    Hotel hotel = null;
    try {
      hotel = restTemplate.exchange(BASE_URL + "hotels/" + id, HttpMethod.GET, makeAuthEntity(), Hotel.class).getBody();
    } catch (RestClientResponseException ex) {
      throw new HotelServiceException(ex.getRawStatusCode() + " : " + ex.getResponseBodyAsString());
    }
    return hotel;
  }

  /**
   * List all reservations in the hotel reservation system
   * @return Reservation[]
   */
  public Reservation[] listReservations() throws HotelServiceException {
    Reservation[] reservations = null;
    try {
      reservations = restTemplate.exchange(BASE_URL + "reservations", HttpMethod.GET, makeAuthEntity(), Reservation[].class).getBody();
    } catch (RestClientResponseException ex) {
      throw new HotelServiceException(ex.getRawStatusCode() + " : " + ex.getResponseBodyAsString());
    }
    return reservations;
  }

  /**
   * List all reservations by hotel id.
   * @param hotelId
   * @return Reservation[]
   */
  public Reservation[] listReservationsByHotel(int hotelId) throws HotelServiceException {
    return null;
  }

  /**
   * Find a single reservation by the reservationId
   * @param reservationId
   * @return Reservation
   */
  public Reservation getReservation(int reservationId) throws HotelServiceException {
    Reservation reservation = null;
    try {
      reservation = restTemplate.exchange(BASE_URL + "reservations/" + reservationId, HttpMethod.GET, makeAuthEntity(), Reservation.class).getBody();
    } catch (RestClientResponseException ex) {
      throw new HotelServiceException(ex.getRawStatusCode() + " : " + ex.getResponseBodyAsString());
    }
    return reservation;
  }

  /**
   * Creates a reservation from a csv string
   * @param CSV
   * @return
   */
  private Reservation makeReservation(String CSV) {
    String[] parsed = CSV.split(",");

    // invalid input (
    if (parsed.length < 5 || parsed.length > 6 ) {
      return null;
    }

    // Add method does not include an id and only has 5 strings
    if (parsed.length == 5) {
      // Create a string version of the id and place into an array to be concatenated
      String[] withId = new String[6];
      String[] idArray = new String[]{new Random().nextInt(1000) + ""};
      // place the id into the first position of the data array
      System.arraycopy(idArray, 0, withId, 0, 1);
      System.arraycopy(parsed, 0, withId, 1, 5);
      parsed = withId;
    }

    return new Reservation(
            Integer.parseInt(parsed[0].trim()),
            Integer.parseInt(parsed[1].trim()),
            parsed[2].trim(),
            parsed[3].trim(),
            parsed[4].trim(),
            Integer.parseInt(parsed[5].trim())
    );
  }



}
