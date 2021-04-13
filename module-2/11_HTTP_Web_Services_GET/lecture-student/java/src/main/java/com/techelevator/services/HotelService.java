package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {


        Hotel [] listOfHotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);



        return listOfHotels;
    }

    public Review[] listReviews() {
        Review[] listOfReviews = restTemplate.getForObject(API_BASE_URL +"reviews", Review[].class);
        return listOfReviews;
    }

    public Hotel getHotelById(int id) {

       Hotel hotel = restTemplate.getForObject(API_BASE_URL+"hotels/" + id, Hotel.class);

        return hotel;
    }

    public Review[] getReviewsByHotelId(int hotelID) {

        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID + "/reviews", Review[].class);
        return reviews;
    }

    public Hotel[] getHotelsByStarRating(int stars) {

        Hotel[] results = restTemplate.getForObject(API_BASE_URL+ "hotels?stars=" + stars, Hotel[].class);
        return results;
    }

    public City getWithCustomQuery(){

        City city = restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:5128581/",City.class);

        return city;
    }

}
