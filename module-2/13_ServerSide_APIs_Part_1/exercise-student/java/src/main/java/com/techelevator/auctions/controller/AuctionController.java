package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(value = "", required = false) String title_like,
                              @RequestParam(required = false) Double currentBid_lte) {

        if (currentBid_lte != null && title_like != null) {
            List<Auction> auctionList = dao.searchByTitleAndPrice(title_like, currentBid_lte);
            return auctionList;
        }

        if (title_like != null) {
            List<Auction> auctions = dao.searchByTitle(title_like);
            return auctions;

        } else if(currentBid_lte != null) {
            List<Auction> auctions = dao.searchByPrice(currentBid_lte);
            return auctions;
        }

        else {

            List<Auction> auctions = dao.list();
            return auctions;
        }


    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return dao.create(auction);



    }
}

//    @RequestMapping(path = "/filter", method = RequestMethod.GET)
//    public List<Auction> filterByTitleAndPrice(@RequestParam(value = "", required = false) String title_like,
//    @RequestParam(required = false) Double currentBid_lte) {
////
//        List<Auction> filteredAuctions = new ArrayList<>();
//        List<Auction> auctions = list(title_like, currentBid_lte);
////
////        // return hotels that match state
//        for (Auction auction : auctions) {
////
//            // if city was passed we don't care about the state filter
//            if (title_like != null ) {
//                if (auction.getTitle().toLowerCase().contains(title_like.toLowerCase())){
//                    filteredAuctions.add(auction);
//                } else {
//                    if(auction.)
//                }
//            }
//            return filteredAuctions;
//        }
//    }

//    @RequestMapping(path = "/filter", method = RequestMethod.GET)
//    public List<Auction> filterByPrice(@RequestParam(required = false) String searchTerm, @RequestParam(required = false) String title_like,  @RequestParam double currentBid_lte){
//
//        List<Auction> filteredAuctions = new ArrayList<>();
//        List<Auction> auctions = list(title_like,currentBid_lte);
//
//        for (Auction auction : auctions) {
//        if(currentBid_lte > 0){
//            if ()
//                filteredAuctions.add(auctions);
//            }
//
//        }
//        return
//    }
//
//
//








