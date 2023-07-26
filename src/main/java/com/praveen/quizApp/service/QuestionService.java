package com.praveen.quizApp.service;

import com.praveen.quizApp.model.Question;
import com.praveen.quizApp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;


    public Question addQuestion(Question question) {

      return questionRepository.save(question);

    }

    public ResponseEntity<List<Question>> getAllQestions() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionByCategory(String category) {

        return questionRepository.findAllByCategory(category);
    }

    public List<Question> getQuestionByDifficultylevel(String difficultylevel) {
        return questionRepository.findAllByDifficultylevel(difficultylevel);
    }
}
