package danielerusso.DAO;

import danielerusso.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventDAO {

    private EntityManager entityManager;

    public EventDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Event newEvent) {

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newEvent);

        transaction.commit();

        System.out.println("Everything went fine.");

    }
}
