package abc_pack;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
public class SendRdct extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("Client_name");
		System.out.println("Hello Your name is:"+name);
		res.sendRedirect("greet");
	}
}
