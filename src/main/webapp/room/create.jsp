<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.md3.model.RoomStatus" %>
<%@ page import="org.md3.model.RoomType" %>


<jsp:include page="../message.jsp" />
<form action="create" method="POST">

    <table class="table table-borderless caption-top">
        <tbody>
        <tr>
            <td>
                <label for="roomCode">Code</label>

            </td>
            <td>
                <input id="roomCode" type="text" required name="roomCode" pattern="[0-9A-Z]{3}-[0-9A-Z]{2}-[0-9A-Z]{2}">
            </td>
        </tr>
        <tr>
            <td>
                <label for="roomArea">Area</label>
            </td>
            <td>
                <input id="roomArea" type="number" required min="20" name="roomArea" step="1">
            </td>
        </tr>

        <tr>
            <td>
                <label for="roomStatus">Status</label>
            </td>
            <td>
                <select id="roomStatus" name="roomStatus" required>
                    <c:forEach var="status" items="${RoomStatus.values()}">
                        <option value="${status}"><c:out value="${status}"/></option>
                    </c:forEach>
                </select>
            </td>

        </tr>
        <tr>
            <td>
                <label for="roomFloor">Floor</label>
            </td>
            <td>
                <input type="number" required name="roomFloor" id="roomFloor" step="1" min="1" max="15">
            </td>
            <%--            <td>--%>
            <%--                <select id="roomFloor" name="roomFloor" required>--%>
            <%--                    <c:forEach var="status" items="${RoomStatus.values()}">--%>
            <%--                        <option value="${status}"><c:out value="${status}"/></option>--%>
            <%--                    </c:forEach>--%>
            <%--                </select>--%>
            <%--            </td>--%>
        </tr>

        <tr>
            <td>
                <label for="roomType">Type</label>
            </td>
            <td>
                <select id="roomType" name="roomType" required>
                    <c:forEach var="type" items="${RoomType.values()}">
                        <option value="${type}"><c:out value="${type}"/></option>
                    </c:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td>
                <label for="roomDescription">Description</label>
            </td>
            <td>
                <textarea id="roomDescription" name="roomDescription" cols="30" rows="4"></textarea>
            </td>
        </tr>

        <tr>
            <td>
                <label for="roomPrice">Price</label>
            </td>
            <td>
                <input id="roomPrice" type="number" required min="1000000" name="roomPrice" step="500000">
            </td>
        </tr>
        <tr>
            <td>
                <label for="roomStartDate">Start Date</label>
            </td>
            <td>
                <input id="roomStartDate" type="date" required name="roomStartDate">
            </td>
        </tr>

        <tr>
            <td>
                <label for="roomEndDate">End Date</label>
            </td>
            <td>
                <input id="roomEndDate" type="date" required name="roomEndDate">
            </td>
        </tr>
        <tr>
            <td>
                <input class="btn btn-primary btn-sm" type="submit" value="Create">
                |
                <a class="btn btn-secondary btn-sm" href="list-room">Cancel</a>
            </td>
        </tr>

        </tbody>
    </table>
</form>