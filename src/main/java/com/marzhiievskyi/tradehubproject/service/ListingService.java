package com.marzhiievskyi.tradehubproject.service;

import com.marzhiievskyi.tradehubproject.dao.ListingDAO;
import com.marzhiievskyi.tradehubproject.domain.Listing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    private final ListingDAO listingDAO;

    public ListingService(ListingDAO listingDAO) {
        this.listingDAO = listingDAO;
    }

    public List<Listing> getAllListings() {
        return listingDAO.findAll();
    }

    public List<Listing> getListingsByClientId(Long id) {
        return listingDAO.getListingsByClientId(id);
    }
}
