<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">



 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

 <style>
  /* Make the image fully responsive */
  .carousel-inner img {
      width: 100%;
      height: 100%;
  }
  </style>

<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<div class="row">
			<div class="col-lg">
				<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
					<ul class="navbar-nav">
						<li class="nav-item active"><a class="nav-link" href="Index">Menu</a></li>
						<li class="nav-item"><a class="nav-link" href="Eleve">Eleve</a></li>
						<li class="nav-item"><a class="nav-link" href="Contact">Contact</a>
						<li class="nav-item"><a class="nav-link" href="Login">Login</a></li>
						<li class="nav-item"><a class="nav-link" href="Cookie">Cookie</a></li>
						<li class="nav-item"><a class="nav-link" href="Celcius">Converter</a></li>
						</li>

					</ul>
				</nav>
			</div>
		</div>
		<div class="row">
			<div class="col-lg">
				<img class=img-responsive style="width: 100%"
					src="images/baniere.jpg">
			</div>
		</div>
		<div class="row">
			<div id="demo" class="carousel slide" data-ride="carousel">
				<ul class="carousel-indicators">
					<li data-target="#demo" data-slide-to="0" class="active"></li>
					<li data-target="#demo" data-slide-to="1"></li>
					<li data-target="#demo" data-slide-to="2"></li>
				</ul>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="images/chien.jpg" alt="chien" width="1100" height="500">
						<div class="carousel-caption">
							<h3>Chien</h3>
							<p></p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/chien1.jpg" alt="chien" width="1100" height="500">
						<div class="carousel-caption">
							<h3>Chien</h3>
							<p></p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="images/tigre.jpg" alt="tigre" width="1100" height="500">
						<div class="carousel-caption">
							<h3>Tigre</h3>
							<p></p>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#demo" data-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</a> <a class="carousel-control-next" href="#demo" data-slide="next">
					<span class="carousel-control-next-icon"></span>
				</a>
			</div>
		</div>
		<div class="row">
			<div class="col-lg"></div>
		</div>


	</div>
</body>
</html>