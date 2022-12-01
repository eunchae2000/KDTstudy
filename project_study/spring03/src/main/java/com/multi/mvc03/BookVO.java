package com.multi.mvc03;

public class BookVO {

	//데이터들을 전달할 때
	//데이터들을 넣어줄 "가방역할"의 클래스가 필요
	//변수를 만들어서 값만 넣었다 뺐다만 함.
	//Value Object
	//Data Transfer Object(DTO)
	private String id;
	private String name;
	private String url;
	private String img;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", name=" + name + ", url=" + url + ", img=" + img + "]";
	}
	
	
}
