<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Números Inteiros Aleatório</title>
</head>
<body>
    <%
    Random random = new Random();
    ArrayList<Integer> lista = new ArrayList<Integer>();
    for(int a = 0; a < 10; a++){
    	lista.add(random.nextInt(1000));
    }
%>

<table>

      <%
           for(int a = 0; a < 10; a++){
          
      %>
         <tr>
             <td> Number:</td>
             <td><%= lista.get(a) %></td>
        </tr>     
      
      <%
           }
      %>
      
</table>
</body>
</html>