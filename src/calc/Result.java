package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Result() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String left = request.getParameter("left");
		String right = request.getParameter("right");
		String op = request.getParameter("op");
		
		switch(op) {
		
			case("add"):
				out.println(left+" "+op+" "+right+" is : "+(Integer.parseInt(left)+Integer.parseInt(right)));
			break;
			case("multiply"):
				out.println(left+" "+op+" "+right+" is : "+(Integer.parseInt(left)*Integer.parseInt(right)));
			break;
			case("subtract"):
				out.println(left+" "+op+" "+right+" is : "+(Integer.parseInt(left)-Integer.parseInt(right)));
			break;
			case("divide"):
				out.println(left+" "+op+" "+right+" is : "+(Integer.parseInt(left)/Integer.parseInt(right)));
			
		
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
