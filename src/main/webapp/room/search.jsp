<div>
    <form method="get" id="searchForm">
<%--        <input style="display: none" name="action" value="search">--%>
        <table class="table table-borderless">
            <thead>
            <tr>
                <th><label for="searchRoomCode">Area</label></th>
                <th><label for="searchRoomFloor">Floor</label></th>
                <th><%--@declare id="searchproductcolor"--%><label for="searchProductColor">Start Date</label></th>
                <th><label for="searchRoomStartDate">End Date</label></th>
                <th><label for="searchFromClear">Clear</label></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input id="searchRoomCode" type="text" name="searchProductName"></td>
                <td><input id="searchRoomFloor" type="text" pattern="[0-9]+" name="searchRoomFloor"></td>
                <td><input id="searchRoomStartDate" type="date" name="searchRoomStartDate"></td>
                <td><input id="searchRoomEndDate" type="date" name="searchRoomEndDate"></td>
                <td><input id="searchFromClear" type="reset" value="Reset"></td>
                <td><input type="submit" value="Search"></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>