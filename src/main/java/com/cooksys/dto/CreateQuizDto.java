package com.cooksys.dto;

import java.util.ArrayList;

import com.cooksys.entity.Question;

public class CreateQuizDto {
	
	private String name;
	private ArrayList<Question> quiz;
	
	
	public CreateQuizDto() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Question> getQuiz() {
		return quiz;
	}


	public void setQuiz(ArrayList<Question> quiz) {
		this.quiz = quiz;
	}
	
	
	

}
