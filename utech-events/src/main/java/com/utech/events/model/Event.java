package com.utech.events.model;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private String title;
    private String description;
    private String faculty;
    private String location;
    private LocalDateTime startTime;
    private int capacity;
    private int placesLeft;

    public Event() {
    }

    public Event(String title, String description, String faculty,
                 String location, LocalDateTime startTime, int capacity) {
        this.title = title;
        this.description = description;
        this.faculty = faculty;
        this.location = location;
        this.startTime = startTime;
        this.capacity = capacity;
        this.placesLeft = capacity;   // a new event starts with every place free
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getPlacesLeft() { return placesLeft; }
    public void setPlacesLeft(int placesLeft) { this.placesLeft = placesLeft; }

    @Override
    public String toString() {
        return "Event{id=" + id + ", title='" + title + "', faculty='" + faculty
                + "', placesLeft=" + placesLeft + "/" + capacity + "}";
    }
}