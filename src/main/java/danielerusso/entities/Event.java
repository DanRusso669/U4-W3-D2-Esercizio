package danielerusso.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

@Table(name = "events")

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "event date")
    private LocalDate eventDate;

    @Column(name = "description")
    private String description;

    @Column(name = "event type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name = "maximum guests")
    private int maxGuests;

    public Event() {
    }

    public Event(String title, LocalDate eventDate, String description, EventType eventType, int maxGuests) {
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.eventType = eventType;
        this.maxGuests = maxGuests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }
}
