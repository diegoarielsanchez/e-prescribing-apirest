package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.das.eprescribing.rest.dto.PetDto;
import org.springframework.das.eprescribing.rest.dto.PetFieldsDto;
import org.springframework.das.eprescribing.rest.dto.PetTypeDto;
import org.springframework.das.eprescribing.model.Pet;
import org.springframework.das.eprescribing.model.PetType;

import java.util.Collection;

/**
 * Map Pet & PetDto using mapstruct
 */
@Mapper
public interface PetMapper {

    @Mapping(source = "owner.id", target = "ownerId")
    PetDto toPetDto(Pet pet);

    Collection<PetDto> toPetsDto(Collection<Pet> pets);

    Collection<Pet> toPets(Collection<PetDto> pets);

    Pet toPet(PetDto petDto);

    Pet toPet(PetFieldsDto petFieldsDto);

    PetTypeDto toPetTypeDto(PetType petType);

    PetType toPetType(PetTypeDto petTypeDto);

    Collection<PetTypeDto> toPetTypeDtos(Collection<PetType> petTypes);
}
