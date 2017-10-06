<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Action Tag</title>
</head>
<body>
<jsp:useBean id="student" class="com.cg.bean.Student.StudentBean">
<jsp:setProperty name="student" property="firstName"/>
<jsp:setProperty name="student" property="lastName"/>
<jsp:setProperty name="student" property="age"/>
</jsp:useBean>
First Name:<jsp:getProperty property="firstName" name="student"/><br>
Last Name:<jsp:getProperty property="lastName" name="student"/><br>
Your age is:<jsp:getProperty property="age" name="student"/><br>
</body>
</html>