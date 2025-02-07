package fr.epsi.b3devc1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa")) {
            System.out.println("Hello World");
        }
    }
}