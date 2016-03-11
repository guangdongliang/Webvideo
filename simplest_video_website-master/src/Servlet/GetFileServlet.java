package Servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/ReadFile.jsp")
public class GetFileServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dir=getServletContext().getRealPath("\\WEB-INF\\video").replace('\\', '/')+"//1.flv";
		FileInputStream is=new FileInputStream(dir);
		int size=is.available();
		byte data[]=new byte[size];
		is.read(data);
		is.close();
		arg1.setHeader("Content-Disposition", "attachment;fileName="+"1.flv");  
		arg1.setContentType("video/x-flv");
		OutputStream os = arg1.getOutputStream();  
        os.write(data);  
        os.flush();  
        os.close();          
	}

	
}
