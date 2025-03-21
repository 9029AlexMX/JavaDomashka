package org.example.repository;

import org.example.entity.User;

import java.util.Optional;

public interface UserRepository {
    User create(User u);

    User update(User u);

    Optional<User> findById(Long id);
}
