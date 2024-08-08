<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${success != null}">
    <div class="alert alert-success" role="alert">${success}</div>
</c:if>


<c:if test="${error != null}">
    <div class="alert alert-danger" role="alert">${error}</div>
</c:if>