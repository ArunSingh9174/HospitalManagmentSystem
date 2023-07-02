<%@page import="com.DTO.user"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Vector" %>
<%@ page import="java.util.Iterator" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Display Page</title>
<link rel="stylesheet" type="text/css" href="css/getall.css">
<style type="text/css">
.admin-button {
            background-color: #4CAF50;
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            border-radius: 4px;
            cursor: pointer;
            
        }
        .admin-button a {
        text-decoration: none;
        color: white;
        }


</style>
</head>
<body>

<button class="admin-button" ><a href="admin-panel.jsp">Back</a></button>
<h1>Data Display Page</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Password</th>
            <th>Contact</th>
            <th>Email</th>
            <th>Address</th>
            <th>State</th>
            <th>Country</th>
        </tr>
        <% 
            Vector<user> users =(Vector) session.getAttribute("ses"); // Call the getall() method to retrieve data
            Iterator<user> iterator = users.iterator();
            while (iterator.hasNext()) {
                user user = iterator.next();
        %>
        <tr>
            <td><%= user.getName() %></td>
            <td><%= user.getPassword() %></td>
            <td><%= user.getContect() %></td>
            <td><%= user.getEmail() %></td>
            <td><%= user.getAddress() %></td>
            <td><%= user.getState() %></td>
            <td><%= user.getCountry() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>