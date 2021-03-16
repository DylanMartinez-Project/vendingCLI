package com.techelevator;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));

        List<Bid> general = generalAuction.getAllBids();
        printAllBids(general);
        System.out.println("Current High: " + generalAuction.getHighBid());

        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        // The rules of a buyout auction automatically end
        // when the buyout price is met
        System.out.println();
        System.out.println("--------------");
        System.out.println("Buyout Auction");
        System.out.println();
        System.out.println();

        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Travel Mug",55);

        buyoutAuction.placeBid(new Bid("Rick Astley", 20));
        buyoutAuction.placeBid(new Bid("Michael Scott", 30));
        buyoutAuction.placeBid(new Bid("Dwight Schrute", 20));
        buyoutAuction.placeBid(new Bid("Ryan Howard", 56));

        List buyoutAuctionBids = buyoutAuction.getAllBids();
        printAllBids(buyoutAuctionBids);
        System.out.println(("Current High: " + buyoutAuction.getHighBid()));
//
        System.out.println();
        System.out.println("--------------");
        System.out.println("Reserve Auction");
        System.out.println();
        System.out.println();
//
        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Hat",80);

        reserveAuction.placeBid(new Bid("Ted Mosby", 35));
        reserveAuction.placeBid(new Bid("Marshall Erickson", 55));
        reserveAuction.placeBid(new Bid("Barney Stinson", 80));
        reserveAuction.placeBid(new Bid("Lily Erickson", 60));
        reserveAuction.placeBid(new Bid("Robin Sherbatsky", 85));

        List<Bid> listOfReserveBids = reserveAuction.getAllBids();
        printAllBids(listOfReserveBids);
        System.out.println(("Current High: " + reserveAuction.getHighBid()));

        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        
    }

    public static void printAllBids(List<Bid> bids) {
        for (Bid bid : bids) {
            System.out.println(bid);
        }
    }
}
