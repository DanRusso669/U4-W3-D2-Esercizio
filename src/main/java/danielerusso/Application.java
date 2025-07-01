package danielerusso;

import danielerusso.DAO.EventDAO;
import danielerusso.entities.Event;
import danielerusso.entities.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2pu");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventDAO ed = new EventDAO(em);

        System.out.println("Hello World!");

        Event event1 = new Event("Welcome Party", LocalDate.now(), "Welcome back party for dad!", EventType.PRIVATE, 30);
        Event event2 = new Event("Book ShowCase", LocalDate.of(2020, 1, 25), "Come see newest books of our neighbourhood.", EventType.PUBBLIC, 150);

        ed.save(event2);
    }
}
