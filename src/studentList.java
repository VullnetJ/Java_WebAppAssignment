
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentList
 */
@WebServlet("/studentList")
public class studentList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentDAO StudentDAO = new StudentDAO() {

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
			}
		};

		List<Student> studentList = StudentDAO.getAllStudents();

		request.setAttribute("studentList", studentList);

		RequestDispatcher rd = request.getRequestDispatcher("studentList.jsp");

		rd.forward(request, response);

	}

}
