<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Fraud apps detection using sentiment analysis and spam filtering</title>

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">



</head>

<body>

	<div id="wrapper">
		<center>
			<h2>Fraud apps detection using sentiment analysis and spam filtering</h2>
		</center>
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
                       
                        <li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                       
                        <li>
                            <a href="AdminHome.jsp"><i class="fa fa-table fa-fw"></i>Home</a>
                        </li>
                        
                        <li>
                            <a href="ViewUsers.jsp"><i class="fa fa-table fa-fw"></i>View Users</a>
                        </li>
                        
                        <li>
                            <a href="Add.jsp"><i class="fa fa-table fa-fw"></i>Add App Data</a>
                        </li>
                        
                         <li>
                            <a href="AddReviews.jsp"><i class="fa fa-table fa-fw"></i>Add App Reviews</a>
                        </li>
                        
                         <li>
                            <a href="Details.jsp"><i class="fa fa-table fa-fw"></i>View All App Details</a>
                        </li>
                        
                        <li>
                            <a href="LogoutController"><i class="fa fa-table fa-fw"></i>Logout</a>
                        </li>
                        
                    </ul>
				</div>

			</div>

		</nav>

		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="login-panel panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Add Reviews</h3>
						</div>
						<div class="panel-body">
							<form role="form" action="AddReviewsController" method="post">
								<fieldset>

									
									<div class="form-group">
									<label>Enter App Id</label>
										<input class="form-control" placeholder="App Id"
											name="loc_id" type="text">
									</div>

									<div class="form-group">
									<label>Enter App Review(*)</label>
										<textarea class="form-control" name="loc_review" rows="7" cols="5" ></textarea>
									</div>
									 <div class="form-group">
                                  <label>Enter Rating(*)</label>
                                <input id="input-21d" class="form-control" name="star"  type="number" class="rating" min=0 max=5 step=0.5 data-size="sm">
                                </div>
									<button type="submit" class="btn btn-lg btn-success btn-block">Add
										Reviews</button>
									<br>

								</fieldset>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>


	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="vendor/raphael/raphael.min.js"></script>
	<script src="vendor/morrisjs/morris.min.js"></script>
	<script src="data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="dist/js/sb-admin-2.js"></script>

</body>

</html>
