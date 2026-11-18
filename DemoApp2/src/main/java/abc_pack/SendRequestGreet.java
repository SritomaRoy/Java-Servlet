
//Here we are looking at session Handling
package abc_pack;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;
import java.io.PrintWriter;
public class SendRequestGreet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("Hello you are inside redirect");
		
		//codes for the session management
//		HttpSession session=req.getSession();
//		String name=(String)session.getAttribute("K");
//		PrintWriter pr=res.getWriter();
//		pr.println("Hello Dear "+name);
		
		//here we start cookies
		//cookie received will be in the respoanse object
		Cookie cookies[]=req.getCookies();			//as multiple cookies can come, hence the array of cookies
		String k=new String();
		for(Cookie c:cookies) {
			if(c.getName().equals("K")) {
				k=c.getValue();
				System.out.println("Value is "+k);
				break;
			}
		}
		PrintWriter pr=res.getWriter();
		pr.println("Hello Dear "+k+"\n");
		pr.println("Welcome to the Cookies\n");
		
	}
}
