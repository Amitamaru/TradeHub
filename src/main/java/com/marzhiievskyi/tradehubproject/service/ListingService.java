package com.marzhiievskyi.tradehubproject.service;

import com.marzhiievskyi.tradehubproject.dao.ListingDAO;
import com.marzhiievskyi.tradehubproject.domain.Listing;
import com.marzhiievskyi.tradehubproject.dto.showInfoListingDTO;
import com.marzhiievskyi.tradehubproject.mappers.ListingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingService {

    private final ListingDAO listingDAO;
    private final ListingMapper listingMapper;

    public List<showInfoListingDTO> getAllListings() {
        List<Listing> listings = listingDAO.findAll();
        return listings.stream().map(listingMapper::toDto).toList();
    }

    public List<showInfoListingDTO> getListingsByClientId(Long id) {
        List<Listing> listingsByClientId = listingDAO.getListingsByClientId(id);
        return listingsByClientId.stream().map(listingMapper::toDto).toList();
    }
}
