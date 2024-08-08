package org.md3.controller;

import org.md3.model.Room;
import org.md3.service.RoomDAO;
import org.md3.service.RoomDAOInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(value = "/list-room")
public class ListGet extends HttpServlet {
    RoomDAOInterface roomDAO = new RoomDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Room> roomList = roomDAO.getAllRoom();
            request.setAttribute("roomList", roomList);
            request.getRequestDispatcher("room/list.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

