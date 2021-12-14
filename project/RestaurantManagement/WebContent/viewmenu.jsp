<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<br><br><br><br><br>
<table width=600 border="2" bgcolor="pink"> 

<thead><td><b>Item Id</b></td><td><b>Item Name</b> </td><td> <b>Type of Item</b> </td> <td> <b>Price</b> </td><td> <b>Quantity</b> </td></thead>
 
<c:forEach var="item" items="${sessionScope.items}">
<tr> 
 <td> ${item.itemId}</td>
 <td> ${item.itemName}</td>
 <td>${item.itemType}</td>
 <td>${item.price}</td>
 <td>${item.quantity}</td>
 <td> <a href="orderitem.do?itemid=${item.itemId}"> Order Now </a></td>
 </tr>
 
</c:forEach> 
</table>
<br>
<br>
<br>

<center> ${requestScope.orderStatus}</center>
</body>
</html>