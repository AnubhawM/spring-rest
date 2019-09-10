package com.cooksys.mapper;

import com.cooksys.dto.CreateQuizDto; 
import com.cooksys.dto.QuizDto;
import com.cooksys.entity.Quiz;

import java.util.ArrayList;
import java.util.HashMap;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface QuizMapper {
	
	
	Quiz createQuizDtoToEntity(CreateQuizDto createQuizDto);
	
	QuizDto entityToDto(Quiz quiz);
	//ArrayList<QuizDto> entitiesToDtos(ArrayList<Quiz> quizzes);
	HashMap<QuizDto> entitiesToDtos(HashMap<Quiz> quizzes);
	

}
