<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
 <style>
        /* CSS styling */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 20px;
        }
        
        .admin-panel {
            max-width: 600px;
            margin: 0 auto;
            background-color: #ffffff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            border-radius: 4px;
            padding: 20px;
        }
        
        h1 {
            color: #333333;
            margin-bottom: 20px;
        }
        
        .admin-buttons {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }
        
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
        
        .admin-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="admin-panel">
        <h1>Admin Panel</h1>
        
        <div class="admin-buttons">
            
            <a href="deleteuser.jsp" ><button class="admin-button">Delete</button></a>
            
            
            <form action="showapo" method="post">
            
            <button class="admin-button">Show Appointment</button>
            
            </form>
            
            
           
            <form action="getall" method="post">
            
            <button class="admin-button">Get All</button>
            
            <button  class="admin-button"><a href="admin_login.jsp">Back</a></button>	
            
            </form>
        </div>
        
        <!-- Additional content for admin panel -->
    </div>
</body>
</html>