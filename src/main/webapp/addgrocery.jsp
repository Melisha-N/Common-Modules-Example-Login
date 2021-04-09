<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="page.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body background="groceryp.jpg" style="background-attachment: fixed;">
<div>
<p style="text-align: center; position: fixed;
    top: 0;
    height: 10%; 
    width: 100%;
    background-color: rgba(252, 250, 250, 0.5);
    color: voilet; font-size: 225%; margin-top: 0%;">Welcome to Grocery Page</p>
</div>
<form action="addgrocery.mel" style="margin: 25%;
	 text-align: center;
	 background-color: rgba(252, 250, 250, 0.5);
	 padding: 3%;"> 
	<br>Grocery Name:<input type="text" name="groceryName"><br> 
	<br>Grocery Type:<input type="text" name="groceryType"><br> 
	<br>Grocery Price:<input type="text" name="groceryPrice"><br> 
	<br>Grocery Quantity:<input type="text" name="groceryQuantity"><br> 
	<br>Grocery Availability:<input type="text" name="groceryAvailability"><br> 
	<br><input type="reset" value="Reset"><br> 
	<br><input type="submit" value="Save"><br>
		
</form>

<div class="footer">
		<h3 style="text-align: center; color: voilet">
			<b>@AllCopyRights.Grocery</b>
		</h3>
</div>

</body>

</body>
</html>

