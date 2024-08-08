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


@WebServlet(value ="/delete-form")
public class DeleteRoomGet extends HttpServlet {
    RoomDAOInterface roomDAO = new RoomDAO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String roomCode = request.getParameter("roomCode");
            Room room = roomDAO.getRoomByCode(roomCode);
            request.setAttribute("room", room);
            request.getRequestDispatcher("room/delete.jsp").forward(request, response);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}