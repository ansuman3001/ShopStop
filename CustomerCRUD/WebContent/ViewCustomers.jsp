<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.lti.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="css/style1.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% HttpSession sessionObj = request.getSession(true);
	int timeout=20;
	sessionObj.setMaxInactiveInterval(timeout);
	response.setHeader("Refresh",timeout +";URL=timeout.jsp");
%>
<a href="NewCustomer.html">Add New Employee>Add new Customer</a><br><br>
<h1>Customers List</h1><br><br>
<% List<Customer> list=CustomerDAO.getAllEmployees(); %>
<TABLE BORDER=1 WIDTH="100%" id="customer">
<TR>
<TH id="tbl-header">Customer Id</TH>
<TH>Customer Name</TH>
<TH>Password</TH>
<TH>Email</TH>
<TH>Country</TH>
<TH>EDIT</TH>
<TH>DELETE</TH>
</TR>
<% for(Customer i:list)
{ %>
<TR>
	<TD><%=i.getId() %></TD>
	<TD><%=i.getName() %></TD>
	<TD><%=i.getPassword() %></TD>
	<TD><%=i.getEmail() %></TD>
	<TD><%=i.getCountry()%></TD>
	<TD><a href='EditCustomer.jsp?id=<%=i.getId() %>'>Edit</a></TD>
	<TD><a href='DeleteServlet?id=<%=i.getId() %>'>Delete</a></TD></TR>
<% } %>
</TABLE>
</body>
</html>