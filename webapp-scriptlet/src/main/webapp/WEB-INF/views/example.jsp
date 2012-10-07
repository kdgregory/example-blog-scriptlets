<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="com.example.webapp.dto.Employee" %>
<%@ page import="com.example.webapp.util.Constants" %>

<html>
<head>
    <title>Scriptlet Example</title>
</head>
<body>

    <label for="employeeSelector">Select employee:</label>
    <select name="employeeSelector">
        <%
        List<Employee> allEmployees = (List<Employee>)request.getAttribute(Constants.PARAM_ALL_EMPLOYEES);
        Employee selectedEmployee  = (Employee)request.getAttribute(Constants.PARAM_SELECTED_EMPLOYEE);
        for (Employee employee : allEmployees)
        {
            String selected = ObjectUtils.equals(employee, selectedEmployee) ? "selected" : "";
            %>
            <option value="<%=employee.getId()%>" <%=selected%>> <%=employee%> </option>
            <%
        }
        %>
    </select>

</body>
</html>
