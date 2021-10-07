<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Números entre 1 e 10000 múltiplos de 5</title>
</head>
<body>
      <%
      ArrayList<Integer> lista = new ArrayList<Integer>();
         for(int a=1; a<=1000; a++){
        	 
        	if(a % 5 == 0){
        		lista.add(a);
        	}
        	 
         }
      %>
      
      <table>
           <%
           for(int a=1; a<=1000; a++){      	   
           
           %>
           
              <tr>
                 <td>Number: </td>
                 <td><%= lista.get(a)%></td>
              </tr>
           <%
           
           }
           
           %>
      </table>
</body>
</html>