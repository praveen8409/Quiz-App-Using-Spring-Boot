package com.praveen.quizApp.controller;

import com.praveen.quizApp.model.Question;
import com.praveen.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;


    @PostMapping("/add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
       Question addedQuestion = questionService.addQuestion(question);
        return new ResponseEntity<>(addedQuestion, HttpStatus.OK);
    }

    @GetMapping("/allQestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
         return questionService.getAllQestions();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        List<Question> questions = questionService.getQuestionByCategory(category);
        return new ResponseEntity<>(questions, HttpStatus.FOUND);
    }

    @GetMapping("/difficultylevel/{difficultylevel}")
    public ResponseEntity<List<Question>> getQuestionByDifficultylevel(@PathVariable String difficultylevel) {
        List<Question> questions = questionService.getQuestionByDifficultylevel(difficultylevel);
        return new ResponseEntity<>(questions, HttpStatus.FOUND);
    }

}
