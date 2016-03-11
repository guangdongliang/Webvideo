package bean;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

//@Entity
//@Table(name = "ppt", catalog = "svw")
public class PPT {
	
	/*private Integer id;
	private String name;
	private String intro;
	private Timestamp edittime;
	private String url;
	
	
	public PPT() {
	}
	public PPT(Integer id, String name, String intro, Timestamp edittime, String url, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.intro = intro;
		this.edittime = edittime;
		this.url = url;
	}
	
	
		// Property accessors
		@Id
		@GeneratedValue(strategy = IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "intro", length = 8192)
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	@Column(name = "edittime", length = 19)
	public Timestamp getEdittime() {
		return edittime;
	}
	public void setEdittime(Timestamp edittime) {
		this.edittime = edittime;
	}
	
	@Column(name = "url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	*/
	
}
