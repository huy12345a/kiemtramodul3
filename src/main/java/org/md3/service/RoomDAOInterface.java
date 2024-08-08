package org.md3.service;

import org.md3.model.Room;

import java.util.List;

public interface RoomDAOInterface {

    List<Room> getAllRoom();
    void addRoom(Room room);

    Room getRoomByCode(String code);

    void deleteRoom(Room room);

}
