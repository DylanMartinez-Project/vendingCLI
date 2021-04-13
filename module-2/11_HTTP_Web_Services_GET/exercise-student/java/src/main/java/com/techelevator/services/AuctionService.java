package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
        Auction[] auctions = restTemplate.getForObject(BASE_URL,Auction[].class);
        return auctions;
    }

    public Auction listDetailsForAuction(int id) {
        Auction auction = restTemplate.getForObject(BASE_URL + "/" + id, Auction.class);

        // api code here
        return auction;
    }
// http://localhost:3000/auctions?title_like=<*value*>
    public Auction[] findAuctionsSearchTitle(String title) {

        Auction[] auction = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
        // api code here

        return auction;
    }
// http://localhost:3000/auctions?currentBid_lte=<*value*>
    public Auction[] findAuctionsSearchPrice(double price) {
        Auction[] auctions = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);

        // api code here
        return auctions;
    }

}
