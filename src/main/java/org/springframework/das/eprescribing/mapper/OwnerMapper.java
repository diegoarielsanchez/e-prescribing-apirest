package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.springframework.das.eprescribing.rest.dto.OwnerDto;
import org.springframework.das.eprescribing.rest.dto.OwnerFieldsDto;
import org.springframework.das.eprescribing.model.Owner;

import java.util.Collection;
import java.util.List;

/**
 * Maps Owner & OwnerDto using Mapstruct
 */
@Mapper(uses = PetMapper.class)
public interface OwnerMapper {

    OwnerDto toOwnerDto(Owner owner);

    Owner toOwner(OwnerDto ownerDto);

    Owner toOwner(OwnerFieldsDto ownerDto);

    List<OwnerDto> toOwnerDtoCollection(Collection<Owner> ownerCollection);

    Collection<Owner> toOwners(Collection<OwnerDto> ownerDtos);
}
