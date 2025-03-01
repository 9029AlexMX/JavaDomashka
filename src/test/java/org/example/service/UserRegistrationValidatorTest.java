package org.example.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationValidatorTest {

    private static UserRegistrationValidator sut;

    @BeforeAll
    static void beforeAll() {
        sut = new UserRegistrationValidator();
    }

    @Test
    void validateMultiple() {
        UserRegistrationDto user = new UserRegistrationDto();
        UserRegistrationValidationException exception = assertThrows(UserRegistrationValidationException.class, () -> {
            sut.validate(user);
        });

        assertNull(exception.errorList.get("phoneNumber"));
        assertEquals(1, exception.errorList.get("email").size());
        assertEquals("Email is required.", exception.errorList.get("email").getFirst());
        assertEquals(1, exception.errorList.get("password").size());
        assertEquals("Password is required.", exception.errorList.get("password").getFirst());
        assertEquals(1, exception.errorList.get("repeatPassword").size());
        assertEquals("Repeat password is required.", exception.errorList.get("repeatPassword").getFirst());
    }

    @Test
    void validateWrongPhoneAndPasswordNotMatch() {
        UserRegistrationDto user = new UserRegistrationDto();
        user.setEmail("alexeyfed@mail.com");
        user.setPassword("qwerty");
        user.setPhoneNumber("099222112");
        UserRegistrationValidationException exception = assertThrows(UserRegistrationValidationException.class, () -> {
            sut.validate(user);
        });

        assertNull(exception.errorList.get("email"));
        assertNull(exception.errorList.get("password"));
        assertEquals(1, exception.errorList.get("phoneNumber").size());
        assertEquals("Please enter valid phone number.", exception.errorList.get("phoneNumber").getFirst());
        assertEquals(2, exception.errorList.get("repeatPassword").size());
        assertEquals("Repeat password is required.", exception.errorList.get("repeatPassword").getFirst());
        assertEquals("Entered passwords do not match.", exception.errorList.get("repeatPassword").getLast());
    }

    @Test
    void validateWrongEmailAndPasswordNotMatch() {
        UserRegistrationDto user = new UserRegistrationDto();
        user.setEmail("a@m");
        user.setPassword("qwerty");
        user.setRepeatPassword("qerty");
        UserRegistrationValidationException exception = assertThrows(UserRegistrationValidationException.class, () -> {
            sut.validate(user);
        });

        assertNull(exception.errorList.get("phoneNumber"));
        assertNull(exception.errorList.get("password"));
        assertEquals(1, exception.errorList.get("email").size());
        assertEquals("Please enter valid email address.", exception.errorList.get("email").getLast());
        assertEquals(1, exception.errorList.get("repeatPassword").size());
        assertEquals("Entered passwords do not match.", exception.errorList.get("repeatPassword").getLast());
    }

    @Test
    void validateNoException() {
        UserRegistrationDto user = new UserRegistrationDto();
        user.setEmail("alexey@mail.com");
        user.setPassword("qwerty");
        user.setRepeatPassword("qwerty");
        user.setPhoneNumber("+380632221100");
        sut.validate(user);
    }
}