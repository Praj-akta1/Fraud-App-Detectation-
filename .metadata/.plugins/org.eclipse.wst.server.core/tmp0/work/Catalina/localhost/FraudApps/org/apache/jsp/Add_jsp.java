/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-23 17:12:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Fraud apps detection using sentiment analysis and spam filtering</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- MetisMenu CSS -->\r\n");
      out.write("<link href=\"vendor/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"dist/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Morris Charts CSS -->\r\n");
      out.write("<link href=\"vendor/morrisjs/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Fonts -->\r\n");
      out.write("<link href=\"vendor/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("		<center>\r\n");
      out.write("			<h2>Fraud apps detection using sentiment analysis and spam filtering</h2>\r\n");
      out.write("		</center>\r\n");
      out.write("		<!-- Navigation -->\r\n");
      out.write("		<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\"\r\n");
      out.write("			style=\"margin-bottom: 0\">\r\n");
      out.write("			<div class=\"navbar-header\">\r\n");
      out.write("				<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\".navbar-collapse\">\r\n");
      out.write("					<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("						class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("						class=\"icon-bar\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("				<div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("					<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                       \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dashboard fa-fw\"></i> Dashboard</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                       \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"AdminHome.jsp\"><i class=\"fa fa-table fa-fw\"></i>Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"ViewUsers.jsp\"><i class=\"fa fa-table fa-fw\"></i>View Users</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"Add.jsp\"><i class=\"fa fa-table fa-fw\"></i>Add App Data</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                         <li>\r\n");
      out.write("                            <a href=\"AddReviews.jsp\"><i class=\"fa fa-table fa-fw\"></i>Add App Reviews</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                         <li>\r\n");
      out.write("                            <a href=\"Details.jsp\"><i class=\"fa fa-table fa-fw\"></i>View All App Details</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"LogoutController\"><i class=\"fa fa-table fa-fw\"></i>Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("					<div class=\"login-panel panel panel-default\">\r\n");
      out.write("						<div class=\"panel-heading\">\r\n");
      out.write("							<h3 class=\"panel-title\">Add App Data</h3>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"panel-body\">\r\n");
      out.write("							<form role=\"form\" action=\"AddLocationController\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("								<fieldset>\r\n");
      out.write("\r\n");
      out.write("								\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<input class=\"form-control\" placeholder=\"App Name\"\r\n");
      out.write("											name=\"loc_name\" type=\"text\">\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<input class=\"form-control\" placeholder=\"App Type\"\r\n");
      out.write("											name=\"loc_type\" type=\"text\">\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-group\">\r\n");
      out.write("										<input class=\"form-control\" name=\"file\" type=\"file\">\r\n");
      out.write("									</div>\r\n");
      out.write("									\r\n");
      out.write("									\r\n");
      out.write("									\r\n");
      out.write("									<button type=\"submit\" class=\"btn btn-lg btn-success btn-block\">Add\r\n");
      out.write("										</button>\r\n");
      out.write("									<br>\r\n");
      out.write("\r\n");
      out.write("								</fieldset>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery -->\r\n");
      out.write("	<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("	<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("	<script src=\"vendor/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Morris Charts JavaScript -->\r\n");
      out.write("	<script src=\"vendor/raphael/raphael.min.js\"></script>\r\n");
      out.write("	<script src=\"vendor/morrisjs/morris.min.js\"></script>\r\n");
      out.write("	<script src=\"data/morris-data.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Custom Theme JavaScript -->\r\n");
      out.write("	<script src=\"dist/js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}