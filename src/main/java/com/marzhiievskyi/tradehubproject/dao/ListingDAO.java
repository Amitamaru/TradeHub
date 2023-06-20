package com.marzhiievskyi.tradehubproject.dao;

import com.marzhiievskyi.tradehubproject.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingDAO extends JpaRepository<Listing, Long> {

    @Query("select l from Listing l where l.client.id = :id")
    List<Listing> getListingsByClientId(@Param("id") Long id);
}
