<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<table class="table table-striped table-hover">
    <thead>
    <tr>
        <th>Code</th>
        <th>Area</th>
        <th>Status</th>
        <th>Floor</th>
        <th>Type</th>
        <th>Price</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="room" items="${roomList}">
        <tr>
            <td>${room.code}</td>
            <td><c:out value="${room.area}"/></td>
            <td><c:out value="${room.status}"/></td>
            <td><c:out value="${room.type}"/></td>
            <td><fmt:formatNumber type="number" maxFractionDigits="2" value="${room.price}"/></td>
            <td><c:out value="${room.startDate}"/></td>
            <td><c:out value="${room.endDate}"/></td>



            <td>
                <a href="delete-form?roomCode=${room.code}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="create-form">Create</a>