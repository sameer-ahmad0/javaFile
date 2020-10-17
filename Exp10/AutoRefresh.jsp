<%@page import="java.util.Calendar, java.text.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Auto Refresh</h2>
<%
response.setIntHeader("Refresh", 1);
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Calendar cal = Calendar.getInstance();
out.println(dateFormat.format(cal.getTime()));
%>
</body>
</html>
