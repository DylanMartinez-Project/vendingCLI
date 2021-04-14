package com.techelevator.services;

import com.techelevator.models.Auction;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.Media;

public class AuctionService {

    private final String BASE_URL;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String url) {
        BASE_URL = url;
    }


    public Auction[] getAll() {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auctions. Is the server running?");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction getOne(int id) {
        Auction auction = null;
        try {
            auction = restTemplate.getForObject(BASE_URL + "/" + id, Auction.class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auction.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auction;
    }

    public Auction[] getByTitle(String title) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("The title was not found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction[] getByPrice(double price) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("No auctions found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction add(String auctionString) {
        Auction auction = makeAuction(auctionString);
        if (auction == null) {
            return null;
        }
        HttpEntity entity = makeEntity(auction);
        try {
            auction= restTemplate.postForObject(BASE_URL, entity,Auction.class);
        } catch (RestClientResponseException e){
            console.printError(e.getRawStatusCode() + "  :  "  + e.getStatusText());
            return null;
        } catch (ResourceAccessException e){
            console.printError(e.getMessage());
            return null;
        }
        return auction;
    }

    public Auction update(String auctionString) {
        Auction auctions = makeAuction(auctionString);
        HttpEntity entity = makeEntity(auctions);
//        if (auctions == null) {
//            return null;
//        }
        try {
            restTemplate.put(BASE_URL  , entity);
        }
        catch (RestClientResponseException ex) {
//            console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
            return null;
        } catch (ResourceAccessException e){
            console.printError(e.getMessage());
            return null;
        }
        return auctions;
    }

    public boolean delete(int id) {

        try {
            restTemplate.delete(BASE_URL + "/" + id);
        } catch (RestClientResponseException ex) {
            console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
            return false;
        }catch (ResourceAccessException e){
            console.printError(e.getMessage());
            return false;
        }
        return true;
    }


    private HttpEntity<Auction> makeEntity(Auction auction) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);

        return entity;
    }

    private Auction makeAuction(String csv) {

        String[] splitElement = csv.split(",");

        Auction auction = new Auction();
        // invalid input
        if (splitElement.length < 3 || splitElement.length > 5) {
            return null;
        }

        if (splitElement.length == 4) {

            auction.setTitle(splitElement[0].trim());
            auction.setDescription(splitElement[1].trim());
            auction.setUser(splitElement[2].trim());
            auction.setCurrentBid(Double.parseDouble(splitElement[3].trim()));

        } else if (splitElement.length == 3){
            auction.setTitle(splitElement[0].trim());
            auction.setDescription(splitElement[1].trim());
            auction.setUser(splitElement[2].trim());
        }  if (splitElement.length == 5  ) {
            auction.setId(Integer.parseInt(splitElement[0].trim()));
            auction.setTitle(splitElement[1].trim());
            auction.setDescription(splitElement[2].trim());
            auction.setUser(splitElement[3].trim());
            auction.setCurrentBid(Double.parseDouble(splitElement[4].trim()));

        }



        return auction;
    }



}
