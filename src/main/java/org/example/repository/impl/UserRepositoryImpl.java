package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.util.JpaUtil;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public User create(User u) {
        EntityTransaction transaction = null;
        try (EntityManager entityManager = emf.createEntityManager()) {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(u);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return u;
    }

    public User update(User u) {
        EntityTransaction transaction = null;
        try (EntityManager entityManager = emf.createEntityManager()) {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(u);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return u;
    }

    public Optional<User> findById(Long id) {
        try (EntityManager entityManager = emf.createEntityManager()) {
            return Optional.ofNullable(entityManager.find(User.class, id));
        }
    }
}
