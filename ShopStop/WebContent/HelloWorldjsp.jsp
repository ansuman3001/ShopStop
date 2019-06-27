<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>





<%! String[] names={"Green","Cyan","Red","Blue","Turquoise","Yellow","Cream","Kala","Neela","Bhoora","Pepe","lolo","Narangi"};
	%>

<body>

<h1>My first5 JSP</h1>
<p>
Todays Date:
<%=(new java.util.Date()).toLocaleString()%>
<font size="3" color="blue">

<% for (int num=1; num<=10; num++){
	
	out.println("Welcome to JSP"+num+"<br>");}%>
	Current Time :<%=java.util.Calendar.getInstance().getTime()%>
	
	<%! int data=50; int data2=60; %>
	<h2>The Value of Variable is:<%=data%></h2>
	<%!
	int cube(int n){
		
		
		return n*n*n;
	}
	
	%>
	
	<h2>The Cube of 3 is :<%= cube(3) %></h2>
	</font>
	<h1>List of colors </h1>
	
	
	
	
	<table border="0">
	 <th>NAMES</th>
	 <%
	 	for(int i=0;i<names.length;i++){
	 		
	 		
	 		
	 		%>
	 		<tr>
	 		<td bgcolor="<%=names[i]%>" width="200"><%=names[i] %></td>
	 		</tr>
	 		<% 
	 		
	 	}
	 
	 
	 %>
	
	
	
	</table>
</body>
</html>