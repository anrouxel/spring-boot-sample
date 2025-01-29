package eu.anrouxel.springbootsample.mapper;

import eu.anrouxel.springbootsample.dto.CreateUserDTO;
import eu.anrouxel.springbootsample.dto.UserDTO;
import eu.anrouxel.springbootsample.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    UserEntity createUserDTOToUser(CreateUserDTO createUserDTO);

    UserDTO userToUserDTO(UserEntity user);
}
