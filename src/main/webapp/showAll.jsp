<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page import="java.util.List, model.Student" %>


<!DOCTYPE html>
<html>
<head>
    <title>All Students</title>
    <link rel="stylesheet" href="css/style.css">
    
</head>
<body>

<h2 style="text-align:center;">Registered Students</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Year</th>
    </tr>

<%
List<Student> list = (List<Student>) request.getAttribute("students");
if (list != null && !list.isEmpty()) {
    for (Student s : list) {
%>
    <tr>
        <td><%= s.getName() %></td>
        <td><%= s.getEmail() %></td>
        <td><%= s.getYear() %></td>
    </tr>
<%
    }
} else {
%>
    <tr>
        <td colspan="3" class="no-data">No students found</td>
    </tr>
<%
}
%>
</table>


</body>
</html>
