package org.md3.controller;

import org.md3.service.RoomDAO;
import org.md3.service.RoomDAOInterface;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value ="/delete")
public class DeleteRoomPost extends HttpServlet {
    RoomDAOInterface roomDAO = new RoomDAO();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String roomCode = request.getParameter("roomCode");
            double roomArea = Double.parseDouble(request.getParameter("roomArea"));
            String roomStatus = request.getParameter("roomStatus");
            int roomFloor = Integer.parseInt(request.getParameter("roomFloor"));
            
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
