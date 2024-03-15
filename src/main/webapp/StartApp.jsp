<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Selling Car</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	height: 100vh;
	background-image:
		url("https://static.vecteezy.com/system/resources/previews/030/491/641/large_2x/futuristic-sports-car-on-a-dark-background-3d-rendering-ai-generated-free-photo.jpg");
	background-attachment: fixed;
	background-repeat: no-repeat;
	background-size: cover;
}

#div {
	display: flex;
	justify-content: center;
	align-items: center;
}

.div {
	border: 1px solid;
	padding: 40px;
	margin-top: 15%;
	border-radius: 40px 0px 40px;
	box-shadow: 0px 0px 20px red;
}

h2 {
	text-align: center;
	color: Red;
	/*background-color: white;*/
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	/*  border: 1px solid medium;*/
	border-radius: 4px;
	box-sizing: border-box;
}

input[type="submit"] {
	width: 100%;
	background-color: green;
	color: white;
	padding: 14px 20px;
	margin: 12px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
}

input[type="submit"]:hover {
	background-color: green;
}

table {
	width: 100%;
}

th {
	color: white;
}

th, td {
	text-align: center;
}

#div1 {
	color: red;
}

button {
	background-color: navy;
}

button:hover {
	background-color: red;
}
</style>
</head>
<body>
	<div id="div">
		<div class="div">
			<h2>Sign In</h2>
			<form action="login" method="post">
				<table>
					<tr>
						<th><label for="username">Username:</label></th>
						<td><input type="text" id="username" name="username"
							placeholder="Email"></td>
					</tr>
					<tr>
						<th><label for="password">Password:</label></th>
						<td><input type="password" id="password" name="password"></td>
					</tr>
				</table>
				<input type="submit" value="Log-In">
			</form>
		</div>
	</div>

	<%!String message;%>
	<%
	message = (String) request.getAttribute("message");
	%>
	<div align="center" id="div1">
		<%
		if (message != null) {
			if (message == "<h1> INVALIED  </h1>") {
		%>
		<script type="text/javascript">
			myFunction();
			function myFunction() {

			}
		</script>
		<%
		}
		%>
		<h4 style="color: red;"><%=message%></h4>
		<%
		}
		%>
	</div>

	<%
	if (message == "<h1>WELCOME</h1>") {
	%>
	<div align="center" id="div2">
		<button onclick="getTransfer()">
			<h4>GET STARTED=></h4>
		</button>

	</div>
	<script type="text/javascript">
		function getTransfer() {
			window.location.href = 'Home.jsp';
		}
	</script>
	<%
	}
	%>


</body>
</html>