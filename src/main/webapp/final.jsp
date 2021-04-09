<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
<a href="emailid.jsp"><input type="submit" value="Get User Data"></a>
<input type="submit" value="LOG OUT">
</div>

<div class="align">
<h1>${savemsg}</h1>
<h1>${loginMsg}</h1><br>
<h1>${updateMsg}</h1><br>
<a href="addgrocery.jsp"><input type="submit" value="Add Grocery"></a>
<div class="footer1">
<h3>@AllCopyRights.Grocery</h3>
</div>
</div>
</body>
</html>