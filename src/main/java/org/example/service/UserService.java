package org.example.service;

public interface UserService {
    UserResponseDto registerUser(UserRegistrationDto userRegistrationDto);
    UserResponseDto getUserById(Long userId);
}
