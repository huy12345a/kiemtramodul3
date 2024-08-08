package org.md3.model;

public enum RoomStatus {
    EMPTY("empty"),
    FUll("full"),
    INFRASTRUCTURE("infrastructure");

    private final String description;

    RoomStatus(String value) {
        this.description = value.toLowerCase();
    }

    public String getDescription() {
        return description;
    }
}