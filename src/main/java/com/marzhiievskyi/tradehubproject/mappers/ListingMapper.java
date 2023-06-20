package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Listing;
import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoListingDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ListingMapper {


    ShowInfoListingDTO toDto(Listing listing);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Listing partialUpdate(ShowInfoListingDTO showInfoListingDTO, @MappingTarget Listing listing);
}
