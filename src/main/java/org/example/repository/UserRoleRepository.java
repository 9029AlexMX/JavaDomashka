package org.example.repository;

import org.example.entity.UserRole;

import java.util.Optional;

public interface UserRoleRepository {
    UserRole create(UserRole role);

    Optional<UserRole> findById(Long id);
}
