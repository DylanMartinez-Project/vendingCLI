package com.techelevator;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.HotelService;

public class App {

    private static final String API_BASE_URL = "http://localhost:3000/";

    public static void main(String[] args) {
        int menuSelection = 999;
        int hotelId = -1;

        ConsoleService consoleService = new ConsoleService();
        HotelService hotelService = new HotelService(API_BASE_URL);

        while (menuSelection != 0) {
            menuSelection = consoleService.printMainMenu();
            if (menuSelection == 1) {

                Hotel[] listOfHotels = hotelService.listHotels();
                consoleService.printHotels(listOfHotels);
//                for (Hotel hotel : listOfHotels){
//                    System.out.println(hotel);
//                }

            } else if (menuSelection == 2) {

                Review[] listOfReviews = hotelService.listReviews();
                consoleService.printReviews(listOfReviews);

            } else if (menuSelection == 3) {

                Hotel hotel = hotelService.getHotelById(1);
               consoleService.printHotel(hotel);
            } else if (menuSelection == 4) {

                Review[] reviews = hotelService.getReviewsByHotelId(1);
                consoleService.printReviews(reviews);


            } else if (menuSelection == 5) {

                Hotel[] listOfThrees = hotelService.getHotelsByStarRating(3);
                consoleService.printHotels(listOfThrees);



                System.out.println("Not implemented");
            } else if (menuSelection == 6) {

                City city = hotelService.getWithCustomQuery();
                System.out.println(city.getFull_name());


                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 0) {
                consoleService.exit();
            } else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }
            // Press any key to continue...
            if(hotelId != 0) {
                consoleService.next();
            }
            // Ensure loop continues
            menuSelection = 999;
        }

        // if the loop exits, so does the program
        consoleService.exit();
    }

}
