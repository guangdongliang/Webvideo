package ssh.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.JSONObject;

@WebServlet(urlPatterns="/android/upLoad.jsp")
public class UpLoad extends BaseServlet{

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DiskFileItemFactory factory = new DiskFileItemFactory();
		String path = "F:\\Java\\Tomcat\\服务器资料\\pictures";//上传文件的保存路径
		factory.setRepository(new File(path));
		factory.setSizeThreshold(1024 * 1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		JSONObject jobj = new JSONObject();
		try {
			System.out.println("a");
			List<FileItem> list = (List<FileItem>)upload.parseRequest(request);
			for(FileItem item : list){
				String name = item.getName();
				String fileName = name.substring(name.lastIndexOf("\\") + 1);
				System.out.println("  dsdfsfd");
				
				InputStream is = item.getInputStream();
				File f = new File(path + fileName);
				FileOutputStream fos = new FileOutputStream(f);
				int hasRead = 0;
				byte[] buf = new byte[1024];
				while((hasRead = is.read(buf)) > 0){
					fos.write(buf, 0, hasRead);
				}
				fos.close();
				is.close();
			}
			jobj.put("result", 1);
			out.print(jobj.toString());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		out.flush();
		out.close();
	}


}
