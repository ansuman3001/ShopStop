<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using includes</title>
</head>
<body>

<jsp:include page="Welcome.html" flush="true"/>
This text will appear after the contents of the <b>Welcome.html</b>are displayed

</body>
</html>