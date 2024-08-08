package org.md3.model;

import java.sql.Date;

public class Room {
    private int id;
    private String code;
    private double area;
    private String status;
    private int floor;
    private String type;
    private String description;
    private double price;
    private Date startDate;
    private Date endDate;

    public Room() {
    }

    public Room(String code, double area, String status, int floor, String type, String description, double price, Date startDate, Date endDate) {
        this.code = code;
        this.area = area;
        this.status = status;
        this.floor = floor;
        this.type = type;
        this.description = description;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Room(int id, String code, double area, String status, int floor, String type, String description, double price, Date startDate, Date endDate) {
        this(code, area, status, floor, type, description, price, startDate, endDate);
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
