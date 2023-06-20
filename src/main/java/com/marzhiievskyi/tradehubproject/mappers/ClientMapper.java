package com.marzhiievskyi.tradehubproject.mappers;

import com.marzhiievskyi.tradehubproject.domain.Client;
import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoClientDTO;
import org.mapstruct.*;


@Mapper(componentModel = "spring")
public interface ClientMapper {


    ShowInfoClientDTO toDto(Client client);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(ShowInfoClientDTO showInfoClientDTO, @MappingTarget Client client);
}
