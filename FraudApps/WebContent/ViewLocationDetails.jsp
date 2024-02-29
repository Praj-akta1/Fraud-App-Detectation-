<!DOCTYPE html>
<%@page import="java.sql.PreparedStatement"%>
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
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    

</head>

<body>

    <div id="wrapper">
<center><h2>Fraud apps detection using sentiment analysis and spam filtering</h2></center>
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               
            </div>
            
            <%
    HttpSession ss=request.getSession();
    String email=(String)ss.getAttribute("email");
    String id1=request.getParameter("id");
    String sql="select * from tbl_app where id='"+id1+"'";
    
    Connection con1=DBConnection.getConnection();
    
    PreparedStatement ps=con1.prepareStatement(sql);
   
    ResultSet rs1=ps.executeQuery();
   
    %>
            
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
                <h3 class="text-upper col-md-offset-0" ><center><b>Recommended Locations</b></center></h3><br>
 <form class="subscription-form">
  <div style="margin-left:140px;margin-right:140px">
  <table class="table table-bordered" style="color:black">
   <%
   String current = request.getParameter("id");
   Connection con=DBConnection.getConnection();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from tbl_app where id='"+current+"'");
   while(rs.next())
   {
	   %>
	   
	<TR>
  	<th>Image</th>
  	<td>
  	 <center><img src="postImage1.jsp?id=<%=rs.getInt(1)%>" width="40%" ></img></center>
  	</td>
  	</TR>
  	
  	
  	
  	 <TR>
  	<th>Name</th>
  	<td><%=rs.getString(2) %></td>
  	</TR>
  	
  	 <TR>
  	<th>Type</th>
  	<td><%=rs.getString(3) %></td>
  	</TR>
  
  	 <TR>
  	<th>View Reviews</th>
  	<td><a href="ViewReviews.jsp?id=<%=rs.getInt(1)%>">View Reviews</a></td>
  	</TR>
  	
  	
  	 
  <%} %> 
 
  </table>
  
          
</form>
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
