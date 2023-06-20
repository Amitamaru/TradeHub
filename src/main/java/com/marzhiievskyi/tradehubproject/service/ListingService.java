package com.marzhiievskyi.tradehubproject.service;

import com.marzhiievskyi.tradehubproject.dao.ListingDAO;
import com.marzhiievskyi.tradehubproject.domain.Listing;
import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoListingDTO;
import com.marzhiievskyi.tradehubproject.mappers.ListingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingService {

    private final ListingDAO listingDAO;
    private final ListingMapper listingMapper;

    public List<ShowInfoListingDTO> getAllListings() {
        List<Listing> listings = listingDAO.findAll();
        return listings.stream().map(listingMapper::toDto).toList();
    }

    public List<ShowInfoListingDTO> getListingsByClientId(Long id) {
        List<Listing> listingsByClientId = listingDAO.getListingsByClientId(id);
        //TODO catch if client id is not exist in db
        return listingsByClientId.stream().map(listingMapper::toDto).toList();

    }

    public ShowInfoListingDTO findListingById(Long id) {
        Listing listing = listingDAO.findById(id).orElseThrow();
        return listingMapper.toDto(listing);
    }
}
