package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.springframework.das.eprescribing.rest.dto.PetTypeDto;
import org.springframework.das.eprescribing.model.PetType;
import org.springframework.das.eprescribing.rest.dto.PetTypeFieldsDto;

import java.util.Collection;
import java.util.List;

/**
 * Map PetType & PetTypeDto using mapstruct
 */
@Mapper
public interface PetTypeMapper {

    PetType toPetType(PetTypeDto petTypeDto);

    PetType toPetType(PetTypeFieldsDto petTypeFieldsDto);

    PetTypeDto toPetTypeDto(PetType petType);

    List<PetTypeDto> toPetTypeDtos(Collection<PetType> petTypes);
}
