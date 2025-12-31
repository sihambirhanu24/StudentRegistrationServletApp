<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <link rel="stylesheet" href="css/style.css">
    
</head>
<body>


<div class="container">
    <h2>Student Registration</h2>

    <form action="register" method="post">
        <input type="text" name="name" placeholder="Student Name" required>

        <input type="email" name="email" placeholder="Email" required>

        <input type="number" name="year" placeholder="Year" required>

        <button type="submit">Register</button>
    </form>
</div>

</body>
</html>