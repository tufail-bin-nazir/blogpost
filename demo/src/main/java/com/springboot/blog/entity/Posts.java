package com.springboot.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		name = "posts" , uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
		)
public class Posts {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY
			)
	private int id;
	
	@Column(name="title", nullable = false)
	private String title;
	
	@Column(name="description", nullable = false)
	private String description;
	
	
	@Column(name="content", nullable = false)
	private String content;


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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
