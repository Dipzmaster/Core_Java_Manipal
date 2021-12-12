<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.ibm.*" %>

<%
Student st=new Student();
st.setRoll(34);
st.setName("Mohan");
st.setMarks(89);

out.println(st.getRoll());
out.println(st.getName());
out.println(st.getMarks());
out.println(st.calculateGrade());

request.setAttribute("student",st);
session.setAttribute("student",st);
application.setAttribute("student",st);

%>





<br>

<jsp:useBean id="s" class="com.ibm.Student" scope="request" />

<%
s.setRoll(9);
s.setName("Sarba");
s.setMarks(77);

out.println(s.getRoll());
out.println(s.getName());
out.println(s.getMarks());
out.println(" grade="+s.calculateGrade());
%>


<hr>

<jsp:useBean id="s2" class="com.ibm.Student" scope="request"/>

<jsp:setProperty name="s2" property="roll" value="45"/>
<jsp:setProperty name="s2" property="name" value="Jack"/>
<jsp:setProperty name="s2" property="marks" value="56.3"/>

Roll= <jsp:getProperty name="s2" property="roll" />
Name= <jsp:getProperty name="s2" property="name" />
Marks =<jsp:getProperty name="s2" property="marks" />








</body>
</html>