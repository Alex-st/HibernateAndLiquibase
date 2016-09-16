package com.core.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtils {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("H2SQL");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        em.getTransaction().begin();

        em.close();
        emf.close();
    }
}
