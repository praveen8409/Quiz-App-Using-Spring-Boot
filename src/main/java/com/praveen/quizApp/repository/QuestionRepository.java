package com.praveen.quizApp.repository;

import com.praveen.quizApp.model.Question;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface QuestionRepository extends JpaRepositoryImplementation<Question, Integer> {
    List<Question> findAllByCategory(String category);

    List<Question> findAllByDifficultylevel(String difficultylevel);

    @Query(value = "SELECT * FROM Question q WHERE q.category = ?1 ORDER BY RAND() LIMIT ?2", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, Integer numQ);
}
