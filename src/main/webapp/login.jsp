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
<body background="darkp.jpg" style="background-attachment: fixed;">
<div>
<p style="text-align: center; position: fixed;
    top: 0;
    height: 14%; 
    width: 100%;
    background-color: rgba(252, 250, 250, 0.5);
    color: white; font-size: 225%; margin-top: 0%;">Welcome to Login Page</p>
</div>

<form action="login.mel" style="margin: 35%;
	 text-align: center;
	 background-color: rgba(252, 250, 250, 0.5);
	 padding: 5%;">
 		<br>User Name:<input type="text" name="userName"><br>
	    <br>Password:<input type="password" name="password"><br>
 		<br><input type="reset" value="CANCEL"><br>
	    <br><input type="submit" value="LOGIN"><br>
 </form>

<div class="footer">
		<h3 style="text-align: center; color: AliceBlue; ">
			<b>Since 90's</b>
		</h3>
</div>
</body>
</html>