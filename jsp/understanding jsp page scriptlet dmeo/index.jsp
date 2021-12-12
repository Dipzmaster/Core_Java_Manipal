<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String str="Hell";%>

<h2> Welcome to my web site </h2>

<%
StringBuffer sb=new StringBuffer(str);
String rev=sb.reverse().toString();

if(rev.equals("olleH"))
{
%>
	
	<h1> Reverse success</h1>
	<p> Welcome </p>
	 you are great!!
	
	
<%
}
else
{
%>

<font color="red"> Rever not sucessful</font>
you are fine!!
<%
}
%>

</body>
</html>