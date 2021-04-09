<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body text-align:"center">
<form action="emailIdDisplay.mel">
 			  <br> Email Id:<input type="email" name="emailId" value="${pageEntity.getEmailId()}"><br>
 			  <br><h3>Details of User to be updated:</h3>
			  <br> User Name:<input type="text" name="userName" placeholder="${pageEntity.getUserName()}"><br>
			 
			  <br>Contact No:<input type="number" name="contactNo" placeholder="${pageEntity.getContactNo()}"><br> 
			  
			  <br> DOB:<input type="date" name="dob" placeholder="${pageEntity.getDob()}"><br>  
			  <br><input type="reset" value="CANCEL"><br>
			  <br><input type="submit" value="SUBMIT">		  			
</form>
</body>
</html>

