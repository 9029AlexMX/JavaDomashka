package org.example;

import org.example.entity.User;
import org.example.entity.UserRole;
import org.example.repository.UserRepository;
import org.example.repository.UserRoleRepository;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.repository.impl.UserRoleRepositoryImpl;

import java.util.List;
import java.util.Optional;

public final class Main {
    private Main() {
    }

    /**
     * App main entry point.
     *
     * @param args Arguments.
     */
    public static void main(final String[] args) {
        UserRepository userRepo = new UserRepositoryImpl();
        UserRoleRepository userRoleRepo = new UserRoleRepositoryImpl();

        // Create new user roles.
        UserRole manager = new UserRole();
        manager.setName("Manager");
        UserRole bo = new UserRole();
        bo.setName("Business Owner");
        UserRole instructor = new UserRole();
        instructor.setName("Instructor");

        userRoleRepo.create(manager);
        userRoleRepo.create(bo);
        userRoleRepo.create(instructor);

        // Find User role by id.
        Optional<UserRole> boFound = userRoleRepo.findById(bo.getId());
        System.out.print(boFound.get());

        // Create new users.
        User johnDoe = new User();
        johnDoe.setName("John Doe");
        johnDoe.setEmail("johndoe@mail.com");
        johnDoe.setRoles(List.of(bo, manager, instructor));

        User jackDaniels = new User();
        jackDaniels.setName("Jack Daniels");
        jackDaniels.setEmail("jackdaniels@mail.com");
        jackDaniels.setRoles(List.of(instructor));

        User captainMorgan = new User();
        captainMorgan.setName("Captain Morgan");
        captainMorgan.setEmail("morgancap@gmail.com");

        userRepo.create(johnDoe);
        userRepo.create(jackDaniels);
        userRepo.create(captainMorgan);

        Optional<User> johnDoeFound = userRepo.findById(johnDoe.getId());
        System.out.print(johnDoeFound.get());
        Optional<User> jackDanielsFound = userRepo.findById(jackDaniels.getId());
        System.out.print(jackDanielsFound.get());
        Optional<User> captainMorganFound = userRepo.findById(captainMorgan.getId());
        System.out.print(captainMorganFound.get());

        captainMorgan.setName("Captain Jack");
        captainMorgan.setEmail("captain.jack@mail.com");
        captainMorgan.setRoles(List.of(instructor));
        userRepo.update(captainMorgan);

        captainMorganFound = userRepo.findById(captainMorgan.getId());
        System.out.print(captainMorganFound.get());
    }
}
