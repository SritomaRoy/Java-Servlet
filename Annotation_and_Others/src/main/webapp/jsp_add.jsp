<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_add</title>
</head>
<body bgcolor="yellow">
	<%
		//we can simply write here code
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int ans=i+j;
		out.println("ans is: "+ans);
		RequestDispatcher dptr=request.getRequestDispatcher("/snd_anno_add");
		request.setAttribute("name", "Hello_kitty");
		//dptr.forward(request, response);      //This will skip the sleep time for 3 second in the middle(it will
		//		work behind the hood but we can't see it)
		//but actually send a post request as it is a request dispatcher it forwards the previous request
		//hence no need to re assign all the attributes
		
	%>
	<script>
	//for the delay code
	//uncomment the dptr.forward(request, response); it will show the content of jsp_add.jsp 
	//wait for 3 second and then land to AddAnnotation.java
	//there it accepts only post request but the window.location.href sends 'get' hence will get 405 error
	//a failed attempt of communication
		setTimeout(function(){
			window.location.href="snd_anno_add";
		}, 3000);
	</script>
</html>