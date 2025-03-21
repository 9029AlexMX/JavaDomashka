package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.entity.UserRole;
import org.example.repository.UserRoleRepository;
import org.example.util.JpaUtil;

import java.util.Optional;

public class UserRoleRepositoryImpl implements UserRoleRepository {
    private final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public UserRole create(UserRole role) {
        EntityTransaction transaction = null;
        try (EntityManager entityManager = emf.createEntityManager()) {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(role);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return role;
    }

    public Optional<UserRole> findById(Long id) {
        try (EntityManager entityManager = emf.createEntityManager()) {
            return Optional.ofNullable(entityManager.find(UserRole.class, id));
        }
    }
}
