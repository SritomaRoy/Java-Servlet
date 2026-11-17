package abc_pack;

import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
public class addServer2 extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		try {
			PrintWriter out=res.getWriter();
			out.println("2nd method response: " + k);
			for(int s=0; s<9000; s++);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		req.setAttribute("k",k);
		RequestDispatcher rr=req.getRequestDispatcher("greet");
		rr.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i*j;
		try {
		PrintWriter out=res.getWriter();
		out.println("result(called get):"+k);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

