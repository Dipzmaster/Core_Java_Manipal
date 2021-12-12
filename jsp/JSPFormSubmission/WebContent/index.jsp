<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="output.jsp">
Enter your username:
<input type="text" name="username">

<br>
Enter your password:
<input typ="password" name="password">
<br>
Enter your address:
<textarea name="address" rows=7 cols=7></textarea>
<br>

Select gender:
<input type="radio" name="gender" value="Male"> Male
<input type="radio" name="gender" value="Female"> Female


<input type="submit" value="login">

<br>



</form>

</body>
</html>