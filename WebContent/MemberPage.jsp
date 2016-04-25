<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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

</head>

<body>

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg"></div>
		<div class="container"></div>
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2 text">
				<h1 for="member">
					Welcome back, <strong>${member}</strong>!
				</h1>

				<div class="description">
					<h5 class="motto">&quot;The great secret of true
						success, of true happiness, is this: the man or woman who asks for
						no return, the perfectly unselfish person, is the most successful.
						&quot;</h5>
					<p>
						<strong>SWAMI VIVEKANANDA.</strong>
					</p>

					<p></p>
					<h5 class="motto">"A spirtually illumined soul
						lives in the world, yet is never contaminated by it."</h5>
					<p>
						<strong>SWAMI BHASKARANANDA</strong>
					</p>
				</div>
			</div>
		</div>
	</div>

<div class="col-sm-10 col-sm-offset-1" >
         <div class="col-md-4 col-sm-6">
 <div class="card-container">
         <div class="card">
             <div class="front">
                 <div class="cover">
                 </div>

                 <div class="content">
                     <div class="main">
                         <h2 class="name"><strong>Upcoming Event!</strong></h2>
                         <h3 class="profession" for="eventName">${eventName}</h3>
                         <p class="profession" for="eventDate">${eventDate}</p>
                         <p class="profession" for="eventTime">${eventTime}</p>

                     </div>
                     <div class="footer">
                         <div class="rating">
                             More Info
                         </div>
                     </div>
                 </div>
             </div> <!-- end front panel -->
             <div class="back">
                 <div class="header">
                     <h5 class="motto">.....</h5>
                 </div>
                 <div class="content">
                     <div class="main">
                         <h4 class="text-center" for="eventName">${eventName}</h4>
                         <p class="text-center" for="eventDescription">${eventDescription}</p>

                         <div class="stats-container">
                             <div class="stats">
                                 <h4>235</h4>
                                 <p>
                                     Attending
                                 </p>
                             </div>
                             <div class="stats">
                                 <h4>114</h4>
                                 <p>
                                     Maybe
                                 </p>
                             </div>
                             <div class="stats">
                                 <h4>35</h4>
                                 <p>
                                     Nope
                                 </p>
                             </div>
                         </div>

                     </div>
                 </div>
                 <div class="footer">
                     <div class="social-links text-center">
                         <a href="http://creative-tim.com" class="facebook"><i class="fa fa-facebook fa-fw"></i></a>
                         <a href="http://creative-tim.com" class="google"><i class="fa fa-google-plus fa-fw"></i></a>
                         <a href="http://creative-tim.com" class="twitter"><i class="fa fa-twitter fa-fw"></i></a>
                     </div>
                 </div>
             </div> <!-- end back panel -->
         </div> <!-- end card -->
     </div> <!-- end card-container -->	
     
     
     <div class="card-container">
         <div class="card">
             <div class="front">
                 <div class="cover">
                 </div>

                 <div class="content">
                     <div class="main">
                         <h2 class="name"><strong>Upcoming Event!</strong></h2>
                         <h3 class="profession" for="eventName">${eventName}</h3>
                         <p class="profession" for="eventDate">${eventDate}</p>
                         <p class="profession" for="eventTime">${eventTime}</p>

                     </div>
                     <div class="footer">
                         <div class="rating">
                             More Info
                         </div>
                     </div>
                 </div>
             </div> <!-- end front panel -->
             <div class="back">
                 <div class="header">
                     <h5 class="motto">.....</h5>
                 </div>
                 <div class="content">
                     <div class="main">
                         <h4 class="text-center" for="eventName">${eventName}</h4>
                         <p class="text-center" for="eventDescription">${eventDescription}</p>

                         <div class="stats-container">
                             <div class="stats">
                                 <h4>235</h4>
                                 <p>
                                     Attending
                                 </p>
                             </div>
                             <div class="stats">
                                 <h4>114</h4>
                                 <p>
                                     Maybe
                                 </p>
                             </div>
                             <div class="stats">
                                 <h4>35</h4>
                                 <p>
                                     Nope
                                 </p>
                             </div>
                         </div>

                     </div>
                 </div>
                 <div class="footer">
                     <div class="social-links text-center">
                         <a href="http://creative-tim.com" class="facebook"><i class="fa fa-facebook fa-fw"></i></a>
                         <a href="http://creative-tim.com" class="google"><i class="fa fa-google-plus fa-fw"></i></a>
                         <a href="http://creative-tim.com" class="twitter"><i class="fa fa-twitter fa-fw"></i></a>
                     </div>
                 </div>
             </div> <!-- end back panel -->
         </div> <!-- end card -->
     </div> <!-- end card-container -->	
     

</div>
</div>


	<!-- Javascript -->

	<script src="assets/js/jquery-1.11.1.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.backstretch.min.js"></script>
	<script src="assets/js/scripts.js"></script>

</body>

</html>