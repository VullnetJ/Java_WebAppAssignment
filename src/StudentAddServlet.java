

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentAddServlet")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain"); 
		response.setCharacterEncoding("UTF-8");
		int studentId = Integer.parseInt(request.getParameter("id")); 
		StudentDAO studentDAO = new StudentDAO(){

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
		
		int addStudent = studentDAO.addStudent(studentId);
		out.print(addStudent);

		
	}

}
