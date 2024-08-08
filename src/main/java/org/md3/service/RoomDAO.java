package org.md3.service;

import org.md3.model.Room;
import org.md3.utils.DatabaseConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoomDAO implements RoomDAOInterface {

    @Override
    public List<Room> getAllRoom() {
        try (Connection connection = DatabaseConnect.getCon()) {
            String sql = "select * from room";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Room> roomList = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                double area = rs.getDouble("area");
                String status = rs.getString("status");
                int floor = rs.getInt("floor");
                String type = rs.getString("type");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                Date startDate = rs.getDate("startDate");
                Date endDate = rs.getDate("endDate");

                roomList.add(new Room(id, code, area, status, floor, type, description, price, startDate, endDate));
            }
            return roomList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addRoom(Room room) {
        String sql = "INSERT INTO room (code, area, status, floor, type, description, price, startDate, endDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnect.getCon()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, room.getCode());
            ps.setDouble(2, room.getArea());
            ps.setString(3, room.getStatus());
            ps.setInt(4, room.getFloor());
            ps.setString(5, room.getType());
            ps.setString(6, room.getDescription());
            ps.setDouble(7, room.getPrice());
            ps.setDate(8, room.getStartDate());
            ps.setDate(9, room.getEndDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Room getRoomByCode(String code) {
        String sql = "SELECT * FROM room WHERE code = ?";
        try (Connection connection = DatabaseConnect.getCon()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int roomId = rs.getInt("id");
                String roomCode = rs.getString("code");
                double roomArea = rs.getDouble("area");
                String roomStatus = rs.getString("status");
                int roomFloor = rs.getInt("floor");
                String roomType = rs.getString("type");
                String roomDescription = rs.getString("description");
                double roomPrice = rs.getDouble("price");
                Date roomStartDate = rs.getDate("startDate");
                Date roomEndDate = rs.getDate("endDate");

                return new Room(roomId, roomCode, roomArea, roomStatus, roomFloor, roomType, roomDescription, roomPrice, roomStartDate, roomEndDate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void deleteRoom(Room room) {
        String sql = "DELETE FROM room WHERE code = ?";
        try(Connection connection = DatabaseConnect.getCon()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, room.getCode());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
