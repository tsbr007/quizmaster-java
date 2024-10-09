package com.quizmaster.quizmaster;

import java.util.List;

public class Question {
    private String questionText;  // The actual question text
    private List<String> options; // List of answer options
    private String correctAnswer; // The correct answer to the question

    // Constructors
    public Question() {}

    public Question(String questionText, List<String> options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getters and Setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    // Override toString method for easier debugging or logging
    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", options=" + options +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
