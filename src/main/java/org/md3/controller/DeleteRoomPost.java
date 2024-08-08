
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
import java.sql.Date;


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
            String roomType = request.getParameter("roomType");
            String roomDescription = request.getParameter("roomDescription");
            double roomPrice = Double.parseDouble(request.getParameter("roomPrice"));
            Date roomStartDate = Date.valueOf(request.getParameter("roomStartDate"));
            Date roomEndDate = Date.valueOf(request.getParameter("roomEndDate"));

            Room room = new Room(roomCode, roomArea, roomStatus, roomFloor, roomType,roomDescription, roomPrice, roomStartDate, roomEndDate);

            roomDAO.deleteRoom(room);

            request.setAttribute("success", "Room deleted");
            request.getRequestDispatcher("room/delete.jsp").forward(request, response);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
