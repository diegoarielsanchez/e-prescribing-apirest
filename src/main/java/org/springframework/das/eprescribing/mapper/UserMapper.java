package org.springframework.das.eprescribing.mapper;

import org.mapstruct.Mapper;
import org.springframework.das.eprescribing.rest.dto.RoleDto;
import org.springframework.das.eprescribing.rest.dto.UserDto;
import org.springframework.das.eprescribing.model.Role;
import org.springframework.das.eprescribing.model.User;

import java.util.Collection;

/**
 * Map User/Role & UserDto/RoleDto using mapstruct
 */
@Mapper
public interface UserMapper {
    Role toRole(RoleDto roleDto);

    RoleDto toRoleDto(Role role);

    Collection<RoleDto> toRoleDtos(Collection<Role> roles);

    User toUser(UserDto userDto);

    UserDto toUserDto(User user);

    Collection<Role> toRoles(Collection<RoleDto> roleDtos);

}
