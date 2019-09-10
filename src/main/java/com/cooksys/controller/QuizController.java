package com.cooksys.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.dto.CreateQuizDto;
import com.cooksys.dto.QuizDto;
import com.cooksys.service.QuizService;

@RestController
@RequestMapping("/Quizzes")
public class QuizController {
	
	private QuizService quizService;
	
	@Autowired
	public QuizController (QuizService quizService) {
		this.quizService = quizService;
	}
	
	@GetMapping
	public ArrayList<QuizDto> getQuizzes() {
		return quizService.getQuizzes();
	}
	
	// Instead of id, use name, as per assignment instructions
	@GetMapping(value = "/{id}")
	public String getQuiz(@PathVariable Integer id) {
		return "You got quiz number " + id;	
	}
	
	
	@PostMapping
	public QuizDto createQuiz(@RequestBody CreateQuizDto quizDto) {
		return quizService.createQuiz(quizDto);
	}
	
	@PutMapping(value = "/{id}")
	public String updateQuiz(@PathVariable Integer id) {
		return "You updated quiz number " + id;
	}
	
	@PatchMapping(value = "/{id}/name")
	public String updateQuizName(@PathVariable Integer id) {
		return "You updated the name of quiz number " + id;
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteQuiz(@PathVariable Integer id) {
		return "You deleted quiz number " + id;
	}
	
}
