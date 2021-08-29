

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

@WebServlet("/studentLIstImproved")
public class studentLIstImproved extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Student student = new Student("Baker", "Ginger", 40, "Rumputie 10", 54120, "PULP");
		Student student2 = new Student("Bruce", "Jack", 10, "Asematori 3", 00520, "Helsinki");
		Student student3 = new Student("Clapp", "Eric", 20, "Luuttutie 4", 54120, "PULP");
		Student student4 = new Student("Doe", "Diana", 30, "Kuusikuja 6", 01200, "Helsinki");

		String studentJsonString = this.gson.toJson(student);
		String studentJsonString2 = this.gson.toJson(student2);
		String studentJsonString3 = this.gson.toJson(student3);
		String studentJsonString4 = this.gson.toJson(student4);

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		response.setCharacterEncoding("UTF-8");
		
		out.println("The student list:" + studentJsonString + " " +
				studentJsonString2 + " "+ studentJsonString3 + " " + studentJsonString4 );
		
	}
	
}


