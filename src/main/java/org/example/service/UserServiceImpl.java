package org.example.service;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.repository.UserRepositoryImpl;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public UserResponseDto registerUser(UserRegistrationDto userRegistrationDto) {
        User userModel = new User();
        userModel.setEmail(userRegistrationDto.getEmail());
        userModel.setPhone(userRegistrationDto.getPhoneNumber());
        userModel.setPassword(userRegistrationDto.getPassword());

        userRepository.save(userModel);

        return new UserResponseDto(
                userModel.getId(),
                userModel.getEmail(),
                userModel.getPhone()
        );
    }

    @Override
    public UserResponseDto getUserById(Long userId) {
        Optional<User> user = userRepository.getById(userId);

        if(user.isPresent())
        {
            User userModel = user.get();
            return new UserResponseDto(
                    userModel.getId(),
                    userModel.getEmail(),
                    userModel.getPhone()
            );
        }
        return null;
    }
}
