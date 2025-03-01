package org.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory instance = initEntityManagerFactory();

    private static EntityManagerFactory initEntityManagerFactory() {
        try {
            return Persistence.createEntityManagerFactory("domashka4");
        } catch (Exception e) {
            throw new RuntimeException("Can't create entity manager factory ", e);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return instance;
    }
}
