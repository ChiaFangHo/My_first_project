
public class test1 {
	package pk1;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/HelloWorld2")
	public class HelloWorld extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
		int count = 0;

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html; charset=Big5");
			PrintWriter out = res.getWriter();

			out.println("<HTML>");
			out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("<BIG>Hello World , �@�ɧA�n !</BIG>" +(++count));
			out.println("</BODY></HTML>");
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}

}
