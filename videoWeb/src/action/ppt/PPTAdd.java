package action.ppt;

import java.io.File;

import service.BaseService;

public class PPTAdd {

	private String name;
	private String intro;
	private File videofile;
	private String videofileFileName;
	private BaseService baseService;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public File getVideofile() {
		return videofile;
	}
	public void setVideofile(File videofile) {
		this.videofile = videofile;
	}
	public String getVideofileFileName() {
		return videofileFileName;
	}
	public void setVideofileFileName(String videofileFileName) {
		this.videofileFileName = videofileFileName;
	}
	public BaseService getBaseService() {
		return baseService;
	}
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
