<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

/* Body styles */
body {
	background-image:
		url("https://images.pexels.com/photos/325044/pexels-photo-325044.jpeg?cs=srgb&dl=pexels-chevanon-photography-325044.jpg&fm=jpg");
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
	border-bottom:1px solid; 
    border-left:none;
    border-right:none;
    box-shadow: 0px 0px 10px white;
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

/* Hero section styles */
.mid {
	height: 80vh;
	text-align: center;
}

h4 {
	margin-top: 20px;
	font-size: 2em;
	margin-bottom: 20px;
	color: white;
}

#div {
	display: flex;
	justify-content: center;
	align-items: center;
	margin: auto;
}



th {
	font-size: 1.2em;
	color: white;
}

td {
	width: 100%;
	padding: 4px;
	margin: 8px 0;
	/*  border: 1px solid medium;*/
	border-radius: 4px;
	width: 80%;
}

input {
	box-sizing: border-box;
	background-color: transparent;
	padding: 5px;
	color: white;
	font-size: 1.2em;
}

input[type="submit"], input[type="reset"] {
	margin-top: 10px;
	background-color: black;
	color: white;
}

input:hover {
	background-color: black;
}

#message {
	margin-top: 5px;
	color: white;
}

/* Footer styles */
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

	<section class="mid">
		<h4>
			<i><u> ADD CAR DETAILS</u></i>
		</h4>
		<div id="div" align="center">
			<form action="AddCar" method="post">
				<table border="1px solid">
					<tr>
						<th>Id</th>
						<td><input id="id" type="text" name="id"></td>
					</tr>

					<tr>
						<th>Name</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th>Model</th>
						<td><input type="text" name="model"></td>
					</tr>
					<tr>
						<th>Brand</th>
						<td><input type="text" name="brand"></td>
					</tr>
					<tr>
						<th>Price</th>
						<td><input type="text" name="price"></td>
					</tr>
					<tr>
						<th>Fuel Type</th>
						<td><input type="text" name="fuel"></td>
					</tr>
					<tr>
						<th>COLOUR</th>
						<td><input type="text" name="colour"></td>
					</tr>
				</table>
				<input . type="submit" value="ADD CAR"> <input type="reset"
					value="RESET DETAILS">
			</form>
		</div>
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

	
		</body>
		</html>
	