package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import action.video.VideoReadAll;
import bean.Video;
import dao.BaseDaoImpl;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import service.BaseService;
import service.BaseServiceImpl;
import util.JsonConvert;

@WebServlet(urlPatterns="/android/ReadAll.jsp")
public class VideoReadAllServlet extends BaseServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		BaseDaoImpl base=(BaseDaoImpl)getCtx().getBean("BaseDao");
		List<Video> list=(List)base.ReadByProperty("Video","islive",Integer.parseInt(request.getParameter("islive")));
		/*JsonConfig config=new JsonConfig();
		config.setExcludes(new String[]{"videostate","category"});
		String str=JSONArray.fromObject(list, config).toString();*/
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String str=gson.toJson(list);
		response.getWriter().print(str);
	}

	
}
