<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>

<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bharatiya Community Library</title>

<!-- CSS -->
<link href='css/bootstrap.css' rel='stylesheet' />
<link href='css/rotating-card.css' rel='stylesheet' />
 <link href="http://netdna.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet" />

<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"	href="assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/css/form-elements.css">
<link rel="stylesheet" href="assets/css/style.css">

</head><%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
   
<div class="container">
    <div class="row">
    	<div class="col-sm-8 col-sm-offset-3 text">
        <h1 class="title" for="member">
        <br>
        <br>
        <br>
            Welcome back, <strong>${member}</strong>!
            <br>
            <small>Check out these upcoming events.</small>
            <br>
            <small>Don't forget to sign up for one.</small>
        </h1>
        </div>
        <div class="col-sm-10 col-sm-offset-1">
         <div class="col-md-4 col-sm-6">
             <div class="card-container">
                <div class="card">
                    <div class="front">
                    <br>
                        <div class="cover">
                            <img src="images/logo_full.jpg"/>
                        </div>
                        
                        <div class="content">
                            <div class="main">
                                <h3 class="name" for="eventName">${eventName}</h3>
                                <p class="profession" for="eventDate">${eventDate}</p>
                                <p class="text-center" for="eventTime">${eventTime}</p>
                            </div>
                            <div class="footer">
                               <p><small>More Info</small></p>
                            </div>
                        </div>
                    </div> <!-- end front panel -->
                    <div class="back">
                        <div class="header">
                            <h5 class="motto">"To be or not to be, this is my awesome motto!"</h5>
                        </div>
                        <div class="content">
                            <div class="main">
                                <h4 class="text-center">Event Description</h4>
                                <p class="text-center" for="eventDescription">${eventDescription}</p>

                                <div class="stats-container">
                                    <div class="stats">
                                        
                                    </div>
                                    <div class="stats">
                                       
                                    </div>
                                    <div class="stats">
                                        
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="footer">
                            <div class="social-links text-center">
                                
                            </div>
                        </div>
                    </div> <!-- end back panel -->
                </div> <!-- end card -->
            </div> <!-- end card-container -->
        </div> <!-- end col sm 3 -->
<!--         <div class="col-sm-1"></div> -->
        <div class="col-md-4 col-sm-6">
            <div class="card-container">
                <div class="card">
                    <div class="front">
                    <br>
                        <div class="cover">
                            <img src="images/logo_full.jpg"/>
                        </div>
                        
                        <div class="content">
                            <div class="main">
                                <h3 class="name" for="eventName">${eventName}</h3>
                                <p class="profession" for="eventDate">${eventDate}</p>
                                <p class="text-center" for="eventTime">${eventTime}</p>
                            </div>
                            <div class="footer">
                               <small>More Info</small>
                            </div>
                        </div>
                    </div> <!-- end front panel -->
                    <div class="back">
                        <div class="header">
                            <h5 class="motto">"To be or not to be, this is my awesome motto!"</h5>
                        </div>
                        <div class="content">
                            <div class="main">
                                <h4 class="text-center">Event Description</h4>
                                <p class="text-center" for="eventDescription">${eventDescription}</p>

                                <div class="stats-container">
                                    <div class="stats">
                                        
                                    </div>
                                    <div class="stats">
                                       
                                    </div>
                                    <div class="stats">
                                        
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="footer">
                            <div class="social-links text-center">
                                
                            </div>
                        </div>
                    </div> <!-- end back panel -->
                </div> <!-- end card -->
            </div> <!-- end card-container -->
        </div> <!-- end col-sm-3 -->
        </div> <!-- end col-sm-10 -->
    </div> <!-- end row -->
    <div class="space-200"></div>
</div>


	<!-- Javascript -->

	<script src="assets/js/jquery-1.11.1.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.backstretch.min.js"></script>
	<script src="assets/js/scripts.js"></script>

</body>

</html>