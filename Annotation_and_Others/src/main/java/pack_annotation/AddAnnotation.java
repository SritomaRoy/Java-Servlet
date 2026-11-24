package pack_annotation;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/snd_anno_add")
public class AddAnnotation extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String usrname=req.getParameter("usrName");
		String passWrd=req.getParameter("passWrd");
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int ans=num1+num2;
		//String name=(String)req.getAttribute("name");
		
		PrintWriter out=res.getWriter();
		//pr.println("Addition of "+ num1 + " and "+num2+"is "+ans);
//		this is not a html page if we check the source in the browser
//		add it manually
		
//		Cookie cookies[]=req.getCookies();
//		String name=new String();
//		for(Cookie c: cookies) {
//			if(c.getName().equals("name")) {
//				name=c.getValue();
//				break;
//			}
//		}
		//PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		out.println("<html>");
		out.println("<body>");
		//out.println("<center> Your name is: "+usrname);
		//out.println("Hello "+name);
		//out.println("<br>");
		out.println("Addition of "+ num1 + " and "+num2+" is "+ans);
		out.println("</center");
		out.println("</body>");
		out.println("</html>");
	}
}
