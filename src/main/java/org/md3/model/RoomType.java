package org.md3.model;

public enum RoomType {
    FULL("rental"),
    SHARE("full");

    private final String description;

    RoomType(String value) {
        this.description = value.toLowerCase();
    }

    public String getDescription() {
        return description;
    }
}
