package org.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.assertArg;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserRepository repository;

    @InjectMocks
    private static UserServiceImpl userService;

    @BeforeEach
    void beforeEach() {
        userService = new UserServiceImpl(repository);
    }

    @Test
    void registerUser() {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        userRegistrationDto.setEmail("test1@mail.com");
        userRegistrationDto.setPhoneNumber("380501112345");
        userRegistrationDto.setPassword("password");
        userRegistrationDto.setRepeatPassword("password");

        User user = new User();
        user.setEmail("test1@mail.com");
        user.setPhone("380501112345");
        user.setPassword("password");

        UserResponseDto resultActual = userService.registerUser(userRegistrationDto);

        Mockito.verify(repository, Mockito.times(1)).save(eq(user));
        assertEquals(resultActual.email(), userRegistrationDto.getEmail());
        assertEquals(resultActual.phone(), userRegistrationDto.getPhoneNumber());
    }

    @Test
    void getUserById() {
        Long userIdExist = 1L;
        Long userIdNotExist = 2L;

        when(repository.getById(eq(userIdExist))).thenReturn(Optional.of(new User()));
        UserResponseDto actualExist = userService.getUserById(userIdExist);
        assertNotNull(actualExist);

        when(repository.getById(eq(userIdNotExist))).thenReturn(Optional.empty());
        UserResponseDto actualNotExist = userService.getUserById(userIdNotExist);
        assertNull(actualNotExist);
    }
}