<html>
<head>
    <title>FreeMarker Example</title>
</head>
<body>

    <label for="employeeSelector">Select employee:</label>
    <select name="employeeSelector">
            <#list employees as emp>
                <@compress single_line=true>
                <option value="${emp.id}" 
                <#if emp == selectedEmployee>
                    selected
                </#if>
                >${emp}</option>
                </@compress>
            </#list>
    </select>
    
</body>
</html>