package abc_pack;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;
public class SendRdct extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("Client_name");
		System.out.println("Hello Your name is:"+name); 
		//If don't want to change the URL but want to pass 'K'
		//As it is a 'get' request, it is accepting values of parameter direct from the URL
		//called URL re-writing
		//res.sendRedirect("SendRedgreet?K="+"ornament");
		
		//Here session management starts
		//we are putting all the data in a session
//		HttpSession session=req.getSession();
//		session.setAttribute("K", "Hello-kitty:"+name);
//		res.sendRedirect("SendRedgreet");
		
		//Now Work with Cookie
		//Cookie is present in jakarta.servlet.http.Cookie
		//Initialise the cookie and send it to the client client will forward it to the next server page
		String cookieName="Hello_XXX_"+name;
		Cookie cookie=new Cookie("K", cookieName);
		res.addCookie(cookie);
		res.sendRedirect("SendRedgreet");
	}
}
