<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="page.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="wallp.png" style="background-attachment: fixed;">
	<div class="header">
		<h1 style="text-align: center; margin-top:2%;"><b>Mel-App</b></h1>
 		<div class="logout">
 			<input style="font-size: 100%;background-position:right; margin-bottom:5%; margin-top:0%; color: black;" type="submit" value="Log Out">
		 </div> 
	</div>
	
	<script type="text/javascript">
	function validateUserName(){
		var usrname = document.validation.userName.value;
		var status = false;
		if(usrname == "" || usrname == null){
			document.getElementById("user").innerHTML = "Please enter valid User Name";
			status = false;
		}
		else{
			document.getElementById("user").innerHTML ="Valid User Name";
			status = true;
		}
		return status;
	}
</script>
	
	<div>
		<form name="validation" action="add.mel" onsubmit="return validateUserName"> 
		
			<div class="align" style="background-attachment:fixed;">
			
				<br> User Name:<input type="text" name="userName"/><span id ="user" style="color:red"></span><br>
				
				<br> Email Id:<input type="email" name="emailId"><br>
				
				<br> Contact No:<input type="number" name="contactNo"><br>
				
				<br> DOB:<input type="date" name="dob"><br> <br>
				
				Gender:<br> <input type="radio" name="gender" value="male">
				<label for="male">Male</label><br>
				 <input type="radio" name="gender" value="female"> 
				 <label for="female">Female</label><br>
				<input type="radio" name="gender" value="other"> 
				<label for="other">Other</label><br> 
				
				Password:<input type="password" name="password"><br> <br>
				
				Confirm Password:<input type="password" name="confirmPassword"><br>
				
				<br> <input type="reset" value="CANCEL"><br><br>
				
				<input type="submit" value="SAVE">

			</div>
	</div>
	</div>
	</form>
	</div>
	<div class="footer">
		<h2 style="text-align:center;"><b>Since 90's</b></h2>
		
	</div>
</body>
</html>