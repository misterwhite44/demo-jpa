package fr.epsi.b3devc1;

import fr.epsi.b3devc1.bo.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa")) {
            EntityManager em = emf.createEntityManager();

            // 🔹 Ajout d'un livre en base
            em.getTransaction().begin();
            Livre nouveauLivre = new Livre("1984", "George Orwell");
            em.persist(nouveauLivre);
            em.getTransaction().commit();
            System.out.println("Livre ajouté : " + nouveauLivre);

            // 🔹 Recherche d'un livre par ID
            Livre livreTrouve = em.find(Livre.class, 1);
            if (livreTrouve != null) {
                System.out.println("Livre trouvé : " + livreTrouve);
            } else {
                System.out.println("Aucun livre trouvé avec cet ID !");
            }
        }
    }
}
