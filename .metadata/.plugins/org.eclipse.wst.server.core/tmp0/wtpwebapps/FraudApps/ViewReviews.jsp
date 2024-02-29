<!DOCTYPE html>
<%@page import="com.bean.AddBean"%>

<%@page import="com.dao.UserDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.connection.DBConnection"%>
<%@page import="java.sql.Connection"%>
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
                            <a href="UserHome.jsp"><i class="fa fa-table fa-fw"></i>Home</a>
                        </li>
                        
                         <li>
                            <a href="SearchApp.jsp"><i class="fa fa-table fa-fw"></i>Search Apps</a>
                        </li>
                        
                        
                        <li>
                            <a href="LogoutController"><i class="fa fa-table fa-fw"></i>Logout</a>
                        </li>
                        
                    </ul>
				</div>

			</div>

		</nav>

		<div id="page-wrapper">
			<div class="row">
				<section class="colorlib-contact" data-section="contact">
					<h2 class="text-upper col-md-offset-0">
						<b>All Reviews</b>
					</h2>
					<br>
					<form class="subscription-form">
						<div style="margin-left: 140px; margin-right: 140px">
							<table class="table table-bordered" style="color: black">
								<tr class="danger" style="color: black">
									<th> Id</th>
									<th> Name</th>
									<th>Review</th>
									<th> Result</th>
									
									<th>Give Reviews</th>
								</tr>
								<%
									String id = request.getParameter("id");
									Connection con = DBConnection.getConnection();
									Statement st1 = con.createStatement();
									UserDao dao=new UserDao();
									
									AddBean bean=dao.SelectLocationName(id);
									
									ResultSet rs1 = st1.executeQuery("select * from tbl_appreview where appid='" + id + "'");
									while (rs1.next()) {
								%>
								<TR>
									<td><%=rs1.getString(2)%></td>
									<td><%=bean.getLoc_name()%></td>
									<td><%=rs1.getString(3)%></td>
										<td><%=rs1.getString(4)%></td>
										
									<td><a
										href="GiveReviews.jsp?locationid=<%=rs1.getString(2)%>&locname=<%=bean.getLoc_name()%>"><b>Give Review</b></a></td>
								</TR>

								<%
									}
								%>

							</table>
						</div>

					</form>
				</section>
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
