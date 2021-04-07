<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="page.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"  src="js/main.js"></script>
</head>
<body background="darkp.jpg" style="background-attachment: fixed;">
	<div class="header">
		<p style="text-align: center; margin-top:1% ; font-size: 26px;"><b>Mel-App</b> 
		<input style="font-size: 55%; background-position: right; margin-bottom: 6%; margin-top: 0%; margin-left:92%; color: black;" type="submit" value="Log Out">
		</p>
	</div>
	<form action="add.mel" name="validation" onsubmit="return validateUserName()">

		<div class="align" style="background-attachment: fixed;">

			<br> User Name:<input type="text" name="userName"><br><span id="userNamelocation"></span>
			
			 <br> Email Id:<input type="email" name="emailId"><br><span id="emaillocation"></span>
			 
			  <br>Contact No:<input type="number" name="contactNo"><br><span id="contactNolocation"></span> 
			  
			  <br> DOB:<input type="date" name="dob"><br><span id="doblocation"></span>  
			  
			  <br> Gender:<br>
			  <input type="radio" name="gender" value="male">
			  <label for="male">Male</label><br> 
			  <input type="radio" name="gender"value="female">
			  <label for="female">Female</label><br>
			  <input type="radio" name="gender" value="other">
			  <label for="other">Other</label>
			  <span id="genderlocation"></span>
			  
			  <br>Password:<input type="password" name="password"><br><span id="passwordlocation"></span>
			  
			  <br> Confirm Password:<input type="password" name="confirmPassword"><br><span id="confirmPasswordlocation"></span>
			   
			  <br> <input type="reset" value="CANCEL"><br>
			  
			  <br> <input type="submit" value="SAVE"><br>
		</div>
	</form>


	<div class="footer">
		<h3 style="text-align: center;">
			<b>Since 90's</b>
		</h3>

	</div>
</body>
</html>