import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jstlCoreExample01")
public class JstlCoreEx01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JstlCoreEx01Servlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Query data from database.
		List<Dept> list = DBUtils.queryDepartments();

		// Store data to 'departments' attribute of request
		request.setAttribute("departments", list);

		// Create RequestDispatcher object
		// to forward the request to jstl_core_example01.jsp
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/WEB-INF/jsps/jstl_core_example01.jsp");

		// Forward the request to JSP page.
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
