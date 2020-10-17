<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Current Data and Time</h2>
<%	java.time.format.DateTimeFormatter dtf1 = java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd");
java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
	java.time.LocalDateTime now = java.time.LocalDateTime.now(); 
	out.print("Date: "+dtf1.format(now)+"\n");
	out.print("Time: "+dtf2.format(now));
%>
</body>
</html>
