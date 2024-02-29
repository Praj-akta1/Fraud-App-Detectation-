package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.AddBean;
import com.dao.AdminDao;
import com.dao.UserDao;
import com.mail.RegisterMail;

@MultipartConfig(maxFileSize = 10485760)
@WebServlet("/AddLocationController")
public class AddLocationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InputStream image=null;		
	String imageName="";
	String path=null;
	File upload=null;
    public AddLocationController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
          PrintWriter out=response.getWriter();
		
          UserDao db=new UserDao();
          
		
		String loc_name=request.getParameter("loc_name");
		String loc_type=request.getParameter("loc_type");
		
        Part part=request.getPart("file");
       
		
		if(part!=null)
		{
			image=part.getInputStream();
			System.out.println("is size:"+image.available());
			imageName=db.extractFileName(part);
			System.out.println("name:"+imageName);
		}
		AddBean bean=new AddBean();
		
		
		bean.setLoc_name(loc_name);
		bean.setLoc_type(loc_type);
		
		bean.setImage(image);
	
	
		
		AdminDao dao=new AdminDao();
		
		
		
		if(dao.InsertAPPData(bean))
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Add Successful')");
			out.println("location='Add.jsp';");
			out.println("</script>");
		
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Fail..............')");
			out.println("location='Add.jsp';");
			out.println("</script>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
