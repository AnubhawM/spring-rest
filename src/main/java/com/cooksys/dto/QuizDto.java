package com.cooksys.dto;

import java.util.ArrayList;

public class QuizDto {

	public Integer id;
	public String name;
	public ArrayList<QuestionDto> questions;
	
	public QuizDto() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<QuestionDto> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<QuestionDto> questions) {
		this.questions = questions;
	}
	
	
	
	
	
}
