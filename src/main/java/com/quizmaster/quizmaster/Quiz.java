package com.quizmaster.quizmaster;

import java.util.List;

public class Quiz {
    private int id;                 // Quiz ID
    private String title;           // Title of the quiz
    private List<Question> questions;  // List of questions in the quiz

    // Constructors
    public Quiz() {}

    public Quiz(int id, String title, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.questions = questions;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Override toString method for easier debugging or logging
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }
}








