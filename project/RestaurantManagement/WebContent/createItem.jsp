<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> New FoodItem Creation Form</h1>
<form method="post" action="createItem.do">
<br>
Enter foodItem Name :
<input type="text" name="itemname" />
<br>
<br>
Select type of food:
<select name="itemtype">
<option value="Tiffin Item"> Tiffin Item</option>
<option value="Lunch Item"> Lunch Item</option>
<option value="Snacks Item"> Snacks Item Item</option>
</select>
<br>
<br>
Enter price of food item :<input type="text" name="price"/>
<br><br/>
Enter quantity:
<input type="text" name="quantity"/>

<br>

<input type="submit" value="Create Item" align="right"/>
</form>

</body>
</html>