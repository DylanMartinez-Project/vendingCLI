package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {




        // Create a new general auction


        System.out.println("GENERAL AUCTION" );

        Bid bid1 = new Bid("Josh", 1);
        Bid bid2 = new Bid ("Fonz", 23);
        Bid bid3 = new Bid ("Rick", 13);



        Auction general = new Auction ("TE SHIRT");

        general.placeBid(bid1);
        general.placeBid(bid2);
        general.placeBid(bid3);

        List<Bid> resultsofGeneral = general.getAllBids();
        System.out.println(resultsofGeneral);

        System.out.println(general.getHighBid());


        System.out.println("RESERVE AUCTION");
        Bid bid4 = new Bid("Rick", 20);
        Bid bid5 = new Bid("Mike", 30);
        Bid bid6 = new Bid("Dwight", 48);
        Bid bid7 = new Bid("Ryan", 56);

        ReserveAuction reserve = new ReserveAuction("MUG", 45);
        reserve.placeBid(bid4);
        reserve.placeBid(bid5);
        reserve.placeBid(bid6);
        reserve.placeBid(bid7);

        List<Bid> listOfReserve = reserve.getAllBids();
        System.out.println(listOfReserve);
        System.out.println("WINNER IS " + reserve.getHighBid());




        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

    }
}
