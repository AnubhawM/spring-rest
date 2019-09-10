package com.cooksys.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cooksys.entity.Quiz;
import com.cooksys.mapper.QuizMapper;
import com.cooksys.repository.QuizRepository;
import com.cooksys.dto.QuizDto;
import com.cooksys.dto.CreateQuizDto;

@Service
public class QuizService {

	private QuizRepository quizRepository;
	private QuizMapper quizMapper;
	
	public QuizService(QuizRepository quizRepository, QuizMapper quizMapper) {
		this.quizRepository = quizRepository;
		this.quizMapper = quizMapper;
	}
	
	
	// This .create() method was when useing BaseRepository, which is not needed. Look at ToDo example
	public QuizDto createQuiz(CreateQuizDto quizDto) {
		Quiz quizEntity = quizMapper.createQuizDtoToEntity(quizDto);
		quizEntity.setId(quizRepository.create(quizEntity));
		return quizMapper.entityToDto(quizEntity);
	}
	
	public ArrayList<QuizDto> getQuizzes() {
		return quizMapper.entitiesToDtos(quizRepository.getAll());
	}
	
	
}
