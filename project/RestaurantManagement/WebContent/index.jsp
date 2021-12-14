<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br><br><br>
<center>
<b>
<a href="createItem.jsp"> Create New Food Item </a><br><br/>
<a href="getMenu.do"> Get Item Menu  </a> <br> <br/>

Check  Availability of Items :
<form action="getItemAvailability.do">
Enter food item name:
<input type="text" name="itemname">
<input type="submit" value="check availability">
</form>
 
${status} 
<br>
${requestScope.availableItem.itemId}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${requestScope.availableItem.itemName}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${requestScope.availableItem.itemType}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${requestScope.availableItem.price}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
${requestScope.availableItem.quantity}

</b>
</center>
</body>
</html>