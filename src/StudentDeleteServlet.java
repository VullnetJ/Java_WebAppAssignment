
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDeleteServlet")
public class StudentDeleteServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain"); 
		response.setCharacterEncoding("UTF-8");
		int studentId = Integer.parseInt(request.getParameter("id")); 
		StudentDAO studentDAO = new StudentDAO(){

			public List<Student> getAllStudents() {
				
				return null;
			}

			public void updateStudent(Student student) {
				
			}
			public Student getStudentByID(int studentId) {
	
				return null;
			}

			public int deleteStudent(int studentId) {
				return 0;
			}

			public int addStudent(int studentId) {

				return 0;
			}

			public int deleteStudent(String id) {

				return 0;
			}

			public void deleteStudent(Student student) {
				
			}};
		
		int errorCode = studentDAO.deleteStudent(studentId);
		out.print(errorCode);
		 
	}

}
