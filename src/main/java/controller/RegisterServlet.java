package controller;

import dao.StudentDAO;
import model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int year = Integer.parseInt(request.getParameter("year"));

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setYear(year);

        try {
            StudentDAO dao = new StudentDAO();
            dao.insertStudent(student);

            response.sendRedirect("show_all");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

