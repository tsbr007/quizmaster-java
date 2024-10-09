package com.quizmaster.quizmaster;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    // Sample data
    private List<Quiz> quizzes = Arrays.asList(
        new Quiz(1, "General Knowledge", Arrays.asList(
            new Question("What is the capital of France?", Arrays.asList("Paris", "London", "Berlin", "Madrid"), "Paris"),
            new Question("Who wrote 'Hamlet'?", Arrays.asList("Shakespeare", "Dickens", "Austen", "Tolkien"), "Shakespeare")
        )),
        new Quiz(2, "Mathematics", Arrays.asList(
            new Question("What is 2 + 2?", Arrays.asList("3", "4", "5", "6"), "4")
        ))
    );

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable int id) {
        return quizzes.stream()
                .filter(quiz -> quiz.getId() == id)
                .findFirst()
                .orElse(null);  // Return null if the quiz with given id is not found
    }
    
    @PostMapping("/submit")
    public ResponseEntity<String> submitQuiz(@RequestBody QuizSubmission submission) {
        // Logic to calculate score
        int score = 0;
        for (QuestionAnswer qa : submission.getQuestionAnswers()) {
            if (qa.getGivenAnswer().equals(qa.getCorrectAnswer())) {
                score++;
            }
        }
        return new ResponseEntity<>("Score: " + score, HttpStatus.OK);
    }
}
