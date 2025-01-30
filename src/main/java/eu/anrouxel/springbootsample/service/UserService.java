package eu.anrouxel.springbootsample.service;

import eu.anrouxel.springbootsample.dto.CreateUserDTO;
import eu.anrouxel.springbootsample.dto.UserDTO;
import eu.anrouxel.springbootsample.entity.UserEntity;
import eu.anrouxel.springbootsample.mapper.UserMapper;
import eu.anrouxel.springbootsample.repository.UserRepository;
import java.util.Optional;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserDTO createUser(CreateUserDTO createUserDTO) {
        UserEntity user = userMapper.createUserDTOToUser(createUserDTO);
        userRepository.save(user);
        return userMapper.userToUserDTO(user);
    }

    public Optional<UserDTO> getUserById(UUID id) {
        return userRepository.findById(id).map(userMapper::userToUserDTO);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
