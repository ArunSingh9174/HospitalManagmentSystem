<%@page import="com.DTO.showapo"%>
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
<button  class="admin-button" ><a href="admin-panel.jsp">Back</a></button>
<h1>All Appoinments</h1>
    <table>
        <tr>
            <th>Doctor Name</th>
            <th>Time</th>
            <th>User Email</th>
            
        </tr>
        <% 
            Vector<showapo> users =(Vector) request.getAttribute("list"); // Call the getall() method to retrieve data
            Iterator<showapo> iterator = users.iterator();
            while (iterator.hasNext()) {
            	showapo user = iterator.next();
        %>
        <tr>
            <td><%= user.getDoctorName()%></td>
            <td><%= user.getTime()%></td>
            <td><%= user.getUser()%></td>
            
        </tr>
        <% } %>
        
        
    </table>
    
    
</body>
</html>