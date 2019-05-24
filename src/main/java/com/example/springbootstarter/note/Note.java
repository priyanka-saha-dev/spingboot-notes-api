package com.example.springbootstarter.note;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Note {

	@Id
	private String id;
	
	@Indexed(unique = true)
	private String title;
	
	private String text;
	
	private Boolean fav;
	
	public Note() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getFav() {
		return fav;
	}

	public void setFav(Boolean fav) {
		this.fav = fav;
	}
	
}
