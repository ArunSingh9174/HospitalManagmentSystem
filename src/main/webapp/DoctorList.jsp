<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Doctor Appointment</title>
<style>
/* CSS styling */
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 20px;
}

h1 {
	color: #333333;
}

.doctor-list {
	display: flex;
	flex-wrap: wrap;
}

.doctor-card {
	width: 300px;
	background-color: #ffffff;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	border-radius: 4px;
	margin: 10px;
	padding: 20px;
}

.doctor-card:hover {
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.doctor-card h2 {
	color: #333333;
	font-size: 20px;
	margin-top: 0;
}

.doctor-card p {
	color: #666666;
	margin-bottom: 10px;
}

.doctor-card select {
	width: 100%;
	padding: 5px;
	margin-bottom: 10px;
}

.appointment-button {
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
</style>
</head>
<body>
	<h1>Doctor Appointment</h1>
<h3 style="color: green">
<%
String name =(String) session.getAttribute("user");
if(name!=null){
	out.print("Welcome "+name);
}


%>



</h3>
	<div class="doctor-list">
		<div class="doctor-card">
			<h2>Dr. Vivek(Physician)</h2>
			<p>MBBS, MD (Medicine)</p>
			<form action="Docapp" method="post">
				<input type="hidden" name="doctor" value="Dr. Vivek(Physician)"> 
				<input type="datetime-local" name="time">
				<button type="submit" class="appointment-button">Book
					Appointment</button>
			</form>
		</div>

		<div class="doctor-card">
			<h2>Dr.Mayank (Orthopedic Surgeon)</h2>
			<p>MBBS, MD</p>
			<form action="Docapp" method="post">
				<input type="hidden" name="doctor" value="Dr.Mayank (Orthopedic Surgeon)"> 
				<input type="datetime-local" name="time">
		
		<button class="appointment-button">Book Appointment</button>
		</form>
	</div>

<div class="doctor-card">
			<h2>Dr.Dk (Surgeon)</h2>
			<p>MBBS, MS (General surgery)</p>
			<form action="Docapp" method="post">
				<input type="hidden" name="doctor" value="Dr.DK (Surgeon)"> <input type="datetime-local" name="time">
				<button type="submit" class="appointment-button">Book
					Appointment</button>
			</form>
		</div>

		<div class="doctor-card">
			<h2>Dr.Pawan (Gynaecologist)</h2>
			<p>MBBS,DGO</p>
			<form action="Docapp" method="post">
				<input type="hidden" name="doctor" value="Dr.Pawan (Gynaecologist)"> <input type="datetime-local" name="time">
		
		<button  class="appointment-button">Book Appointment</button>
		</form>
	</div>

            <a href="index.jsp">
                    <button  type="submit" class="appointment-button">Log Out</button>
                </a>


	<!-- Add more doctor cards as needed -->
	</div>
</body>
</html>
