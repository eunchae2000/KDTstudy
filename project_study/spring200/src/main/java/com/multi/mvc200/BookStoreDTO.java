package com.multi.mvc200;

public class BookStoreDTO {
	private int id;
	private String title;
	private String writer;
	private String publish;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	
	@Override
	public String toString() {
		return "BookStoreDTO [id=" + id + ", title=" + title + ", writer=" + writer + ", publish=" + publish + "]";
	}

	
}
