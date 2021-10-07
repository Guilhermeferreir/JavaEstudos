<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data dos ultimos 7 dias</title>
</head>
<body>
    <%
    LocalDate data = LocalDate.now();
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    String date = data.format(f);
%>
    <h1>Data Atual: <%=date %></h1>
    <%
        for (int a = 1; a <= 7; a++){
            LocalDate datenew = data.minusDays(a);
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            String dateformat = datenew.format(formatters);
    %>
        <h3>Data: <%=dateformat %></h3>
    <%
        }
    %>
</body>
</html>