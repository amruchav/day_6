<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripting Elements</title>
</head>
<body>
<% out.print("welcome to jsp"); %><br></br>   <!-- SCRIPTLET TAG --> 
<%= "welcome to jsp" %><br></br> <!--  Expression Tag -->

<!-- Declaration Tag -->
<!-- (1) Declaration tag that declares field -->
<%! int data=50; %>  
<%= "Value of the variable is:"+data %><br></br>  
<!-- (2) Declaration tag that declares method -->
<%!   
int cube(int n){  
return n*n*n;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  
</body>  
</html>
