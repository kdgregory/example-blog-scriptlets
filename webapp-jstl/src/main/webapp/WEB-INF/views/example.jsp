<%@ page contentType="text/html; charset=UTF-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<html>
<head>
    <title>Example JSP Using Scriptlets</title>
</head>
<body>

    <label for="employeeSelector">Select employee:</label>
    <select name="employeeSelector">
    <c:forEach var="emp" items="${employees}">
        <option value="${emp.id}"
            <c:if test="${!(empty selectedEmployee) and (selectedEmployee eq emp)}"> selected </c:if>
        >${emp}</option>
    </c:forEach>
    </select>
</body>
</html>
