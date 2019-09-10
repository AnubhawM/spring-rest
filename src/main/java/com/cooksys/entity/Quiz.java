package com.cooksys.entity;

import java.util.ArrayList;
import javax.persistence.*;


@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private ArrayList<Question> quiz;
	
	public Quiz() {
		
	}
	
//	public Quiz(Integer id, String name, ArrayList<Question> quiz) {
//		this.id = id;
//		this.name = name;
//		this.quiz = quiz;
//	}

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

	public ArrayList<Question> getQuiz() {
		return quiz;
	}

	public void setQuiz(ArrayList<Question> quiz) {
		this.quiz = quiz;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + ", quiz=" + quiz + "]";
	}
	
	
	
	
}



