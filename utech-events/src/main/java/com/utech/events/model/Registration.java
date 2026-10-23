package com.utech.events.model;

import java.time.LocalDateTime;

public class Registration {

    private Long id;
    private String studentId;
    private Event event;
    private LocalDateTime registeredAt;

    public Registration() {
    }

    public Registration(String studentId, Event event) {
        this.studentId = studentId;
        this.event = event;
        this.registeredAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }

    public LocalDateTime getRegisteredAt() { return registeredAt; }
    public void setRegisteredAt(LocalDateTime registeredAt) { this.registeredAt = registeredAt; }

    @Override
    public String toString() {
        return "Registration{id=" + id + ", studentId='" + studentId
                + "', event=" + (event == null ? null : event.getTitle()) + "}";
    }
}