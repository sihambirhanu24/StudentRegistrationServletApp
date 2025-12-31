package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAO {
	private static final String URL =
			"jdbc:mysql://localhost:3306/student_dbs?useSSL=false&serverTimezone=UTC";

    private String jdbcUsername = "";
    private String jdbcPassword = "";

 
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                URL, jdbcUsername, jdbcPassword);
    }


    public void insertStudent(Student student) throws Exception {
    	String sql = "INSERT INTO student(name, email, year) VALUES (?, ?, ?)";

        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, student.getName());
        ps.setString(2, student.getEmail());
        ps.setInt(3, student.getYear());

        ps.executeUpdate();
        ps.close();
        con.close();
    }


    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students";
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");


        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setYear(rs.getInt("year"));
            list.add(s);
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }
	
}
