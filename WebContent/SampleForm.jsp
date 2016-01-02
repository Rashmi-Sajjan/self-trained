<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Details below</h1>
<form action="SubmitInt.jsp">
			Enter Name:<input type="text" name="name" id="name"/><br/>
			Enter Email:<input type="text" name="email" id="email"/><br/>
			Select Gender: Male<input type="radio" name="gender" id="gender" checked="true" value="Male"/>
			Female:<input type="radio" name="gender" id="gender" value="Female"/><br/>
			Select city:<select name="city" >
			<option value="bangalore">Bangalore</option>
			<option value="hyderabad">Hyderabd</option>
			<option value="chennai">Chennai</option>
			<option value="Delhi">Delhi</option>
			</select><br/>
			<input type="submit" name="Submit"/>
</form>
<h1>${res }</h1><br/>
</body>
</html>