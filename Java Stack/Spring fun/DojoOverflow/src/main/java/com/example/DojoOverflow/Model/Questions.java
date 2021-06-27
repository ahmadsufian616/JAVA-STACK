package com.example.DojoOverflow.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="questions")
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull 
	private String question;
    
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	
	@OneToMany(mappedBy="questions", fetch = FetchType.LAZY)
	private List<Answer> answer;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Tags_Questions", joinColumns = @JoinColumn(name = "question_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private List<Tag> tag;


	public Questions() {
		
	}



	public Questions(Long id, String question, List<Answer> answer, List<Tag> tag) {
		
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.tag = tag;
	}


	public List<Answer> getAnswer() {
		return answer;
	}



	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Tag> getTag() {
		return tag;
	}


	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	
	
	
	

}
