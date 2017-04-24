package com.mum.group2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private long questionId;
	private String description;
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", description=" + description + "]";
	}
	
	

}
