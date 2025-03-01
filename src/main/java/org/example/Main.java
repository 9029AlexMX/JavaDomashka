package org.example;

import org.example.repository.UserRepositoryImpl;
import org.example.service.*;

public final class Main {
    private Main() {
    }

    /**
     * App main entry point.
     *
     * @param args Arguments.
     */
    public static void main(final String[] args) {
        UserRegistrationDto userRegister = new UserRegistrationDto();
        userRegister.setEmail("ben.o@gmail.com");
        userRegister.setPassword("secret");
        userRegister.setRepeatPassword("secret");
        userRegister.setPhoneNumber("380992981276");

        UserRegistrationValidator validator = new UserRegistrationValidator();
        validator.validate(userRegister);

        UserService service = new UserServiceImpl(new UserRepositoryImpl());
        UserResponseDto userResponse = service.registerUser(userRegister);

        UserResponseDto userResponseToCheck = service.getUserById(userResponse.id());
        System.out.println(userResponseToCheck);
    }
}
