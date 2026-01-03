Student Registration System (Java Servlet)
📌 Project Overview

The Student Registration System is a simple Java Servlet–based web application developed as a laboratory/academic project. The system allows users to register students into a database and view a list of all registered students in a tabular format.

This project demonstrates the fundamentals of Java Servlets, JDBC, database connectivity, and basic web application development.

🎯 Objectives

To understand Java Servlet request and response handling

To perform database operations using JDBC

To implement basic CRUD functionality (Create & Read)

To design a simple web-based student registration system

✨ Features

Register a student using an HTML form

Validate input data on the server side

Store student records in a relational database

Retrieve and display all registered students

Display data in an HTML table

🛠 Technologies Used

Java

Java Servlets

JDBC

MySQL / PostgreSQL

HTML

Apache Tomcat Server


🔄 Application Flow
1️⃣ Student Registration (POST /register)

User fills in Name, Email, and Year in the registration form

Servlet validates the input

Data is inserted into the database using JDBC

2️⃣ View All Students (GET /show_all)

Servlet retrieves all student records from the database

Data is passed to the view

Students are displayed in an HTML table

⚙️ Setup & Installation
Prerequisites

JDK 8 or higher

Apache Tomcat 9+

MySQL

IDE (Eclipse / NetBeans / IntelliJ)

👩‍💻 Author

Siham Birhanu
