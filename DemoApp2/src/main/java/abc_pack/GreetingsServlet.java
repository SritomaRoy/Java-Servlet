package abc_pack;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingsServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		int k=(int)req.getAttribute("k");
		String msg="Hello Dear you got:"+k;
		PrintWriter out=res.getWriter();
		out.println(msg);
		System.out.println("Hello");
	}
}
