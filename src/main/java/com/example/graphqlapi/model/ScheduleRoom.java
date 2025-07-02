package com.example.graphqlapi.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class ScheduleRoom {

    @Id
    private UUID id;

    private String description;

    private UUID locationID;

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public UUID getLocationID() { return locationID; }
    public void setLocationID(UUID locationID) { this.locationID = locationID; }
}