+<%@page import="com.jspider.cardekhoservletandJDBC.JDBC.ViewCarsJDBC"%>
<%@page import="com.jspider.cardekhoservletandJDBC.login.ViewCar"%>
<%@page import="com.jspider.cardekhoservletandJDBC.object.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cars</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

/* Body styles */
body {
	background-image:
		url("https://wallpapercave.com/wp/wp7913277.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center;
	font-family: Arial, sans-serif;
	line-height: 1.6;
	border: 1px solid;
}

/* Header styles */
header {
	background-color: transparent;
	color: white;
	padding: 20px;
	position: Sticky;
	top: 10px;
	border-bottom: 1px solid;
	border-left: none;
	border-right: none;
	box-shadow: 0px 0px 10px white;
	border-bottom: 1px solid;
}

h1 {
	text-align: center;
	font-size: 2.5em;
	margin-right: auto;
}

nav ul {
	list-style: none;
	display: flex;
	justify-content: end;
}

nav ul li {
	margin-right: 20px;
	text-align: right;
	padding: 4px;
	margin-top: 20px;
}

nav ul li a {
	padding: 5px;
	color: white;
	background-color: black;
	text-decoration: none;
	box-shadow: 0px 0px 20px red;
	border-radius: 20px 20px;
}

#div1 {
	margin-left: 30px;
	margin-top: 50px;
}

th {
	font-size: 1.2em;
	color: green;
	text-align: center;
	padding: 10px;;
}

td {
	color: white;
	border-radius: 4px;
	text-align: center;
}

.class {
	display: flex;
	justify-content: space-between;
	
}

#sec {
	height: 50vh;
	width: 100vh;
	text-align: center;
	margin-right: 100px;
	margin-top: 100px;
	box-shadow: 0px 0px 10px white;
}

h2 {
	margin-top: 5px;
	font-size: 2.5em;
	margin-bottom: 20px;
	color: white;
}

#button {
	display: flex;
	justify-content: center;
	flex-wrap: wrap;
}

#button1 {
	margin-left: 20px;
}

.btn {
	background-color: #f44336;
	color: #fff;
	padding: 10px 20px;
	text-decoration: none;
	border-radius: 5px;
	transition: background-color 0.3s ease;
}

.btn:hover {
	background-color: #d32f2f;
}


#formID {
	background-color: transparent;
}

form {
	margin-top: 30px;
}

input {
	background-color: black;
	color: White;
	text-align: center;
	padding: 4px;
}

input[type="submit"] {
	margin-top: 20px;
}
#message {
	margin-top: 10px;
	color: white;
}
</style>
</head>
<body>
	<header>
		<nav>
			<ul>
				<h1>Car Selling Website</h1>
				<li><a
					href="http://localhost:8080/cardekhoservletandJDBC/Home.jsp">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</nav>
	</header>
	<%
	List<Car> cars = ViewCarsJDBC.searchAllCars();
	if (cars != null && cars.size() > 0) {
	%>
	<section class="class">
		<div id="div1" class="mid" align="left">
			<table border="1px solid">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Model</th>
					<th>Brand</th>
					<th>Price</th>
					<th>FuelType</th>
					<th>Color</th>
				</tr>
				<%
				for (Car car : cars) {
				%>
				<tr>
					<td><%=car.getId()%></td>
					<td><%=car.getName()%></td>
					<td><%=car.getModel()%></td>
					<td><%=car.getBrand()%></td>
					<td><%=car.getPrice()%></td>
					<td><%=car.getFuelType()%></td>
					<td><%=car.getColour()%></td>
				</tr>
				<%
				}
				%>
			</table>
		</div>
		<section class="mid" id="sec">
			<h2>Remove Car From Website</h2>
			<div id="button">
				<button>
					<a href="http://localhost:8080/cardekhoservletandJDBC/ViewCar.jsp" class="btn">View all car</a>
				</button>
				<button id="button1" onclick="getForm()">
					<a href="#" class="btn">Delete Car By ID</a>
				</button>
			</div>
			<span id="formID" align="center"></span>
			<%!String message;%>
		<%
		message = (String) request.getAttribute("message");
		%>
		<div align="center" id="message">
			<%
			if (message != null) {
			%>
			<h4><%=message%></h4>
			<%
			}
			%>
		</div>
		</section>
	</section>
	<script type="text/javascript">
		function getForm() {
			var formContainer = document.getElementById("formID");
			var form = document.createElement("form");
			form.setAttribute("action", "deletecar");
			form.setAttribute("method", "post");
			var input1 = document.createElement("input");
			input1.setAttribute("type", "text");
			input1.setAttribute("name", "id");
			input1.setAttribute("placeholder", "Enter ID");
			var submitButton = document.createElement("input");
			submitButton.setAttribute("type", "submit");
			submitButton.setAttribute("value", "Submit");
			form.appendChild(input1);
			form.appendChild(document.createElement("br"));
			form.appendChild(submitButton);
			formContainer.appendChild(form);
		}
	</script>

	<%
	} else {
	%>
	<div align="center">
		<h4>Car details unavailable</h4>
	</div>
	<%
	}
	%>


</body>
</html>