<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><strong>Tabuada do 10</strong></h1>
    <table>
    <%
        for(int a = 1; a <= 10; a++){
    %>
        <tr>
            <td>10</td>
            <td>x</td>
            <td><%=a %></td>
            <td>=</td>
            <td><%=a * 10 %></td>
        </tr>
    <%
        }
    %>
    </table>

    <h1><strong>Tabuada do 12</strong></h1>
    <table>
    <%
        for(int a = 1; a <= 10; a++){
    %>
        <tr>
            <td>12</td>
            <td>x</td>
            <td><%=a %></td>
            <td>=</td>
            <td><%=a * 12 %></td>
        </tr>
    <%
        }
    %>
    </table>

    <h1><strong>Tabuada do 14</strong></h1>
    <table>
    <%
        for(int a = 1; a <= 10; a++){
    %>
        <tr>
            <td>14</td>
            <td>x</td>
            <td><%=a %></td>
            <td>=</td>
            <td><%=a * 14 %></td>
        </tr>
    <%
        }
    %>
    </table>

    <h1><strong>Tabuada do 16</strong></h1>
    <table>
    <%
        for(int a = 1; a <= 10; a++){
    %>
        <tr>
            <td>16</td>
            <td>x</td>
            <td><%=a %></td>
            <td>=</td>
            <td><%=a * 16 %></td>
        </tr>
    <%
        }
    %>
    </table>
</body>
</html>