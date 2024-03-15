<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* Reset CSS */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Body styles */
body {
    background-image:url("https://static.vecteezy.com/system/resources/previews/030/491/641/large_2x/futuristic-sports-car-on-a-dark-background-3d-rendering-ai-generated-free-photo.jpg");
    background-size: cover;
    background-repeat:no-repeat;
    background-attachment:fixed;
    background-position:center;
    font-family: Arial, sans-serif;
    line-height: 1.6;
    border: 1px solid;
    
}

/* Header styles */

header {
    background-color: transparent;
    color: white;
    padding: 20px;
    position:Sticky;
    border-bottom:1px solid; 
    border-left:none;
    border-right:none;
    box-shadow: 0px 0px 10px white;
    
    
}

header h1 {
    margin-bottom: 10px;
    text-align: center;
     font-size: 2.5em;
}

nav ul {
    list-style: none;
    display: flex;
    justify-content: end;
}

nav ul li {     
    margin-right: 20px;
    text-align: right;
    padding:4px;
}

nav ul li a {
    padding:5px;
    color:white;
    background-color:black;
    text-decoration: none;
    box-shadow:0px 0px 20px red; 
    border-radius: 20px 20px;
}


/* Hero section styles */
.mid{
    height:50vh;
    text-align: center;
    border-bottom:1px solid; 
}

.mid h2 {
margin-top:110px;
    font-size: 2.5em;
    margin-bottom: 20px;
    color: white;
    
}

.mid p {
    font-size: 1.2em;
    color:white;
    margin-bottom: 20px;
}

.btn {
    display: inline-block;
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

/* Footer styles */
footer {
    background-color: #333;
    color: #fff;
    margin-bottom:1px;
    text-align: center;
    padding: 20px;
}

</style>
</head>
<body>
     
     <header>
        <h1>Car Selling Website</h1>
        <nav>
            <ul>
                <li><a href="http://localhost:8080/cardekhoservletandJDBC/Home.jsp">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    
    <section class="mid">
        <h2>Welcome to Our Car Selling Website</h2>
        <p>Find your dream car today!</p>
        <p>Sell your car today!</p>
        <button ><a href="http://localhost:8080/cardekhoservletandJDBC/ViewCar.jsp" class="btn">Buy Car</a></button>
        <button onclick="getAdd()"><a href="http://localhost:8080/cardekhoservletandJDBC/AddCar.jsp" class="btn">Sell Car</a></button>
        <button onclick="getView()"><a href="http://localhost:8080/cardekhoservletandJDBC/UpdateCar.jsp" class="btn">Update Detail</a></button>
        <button onclick="getView()"><a href="http://localhost:8080/cardekhoservletandJDBC/Delete.jsp" class="btn">Delete Car</a></button>
    </section>

    <footer>
        <p>&copy; 2024 Car Selling Website</p>
    </footer>
    
   
</body>
</html>