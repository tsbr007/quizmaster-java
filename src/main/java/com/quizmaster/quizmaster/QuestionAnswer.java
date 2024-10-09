package com.quizmaster.quizmaster;

public class QuestionAnswer {
    private String question;
    private String givenAnswer;
    private String correctAnswer;
    
    
    
    public QuestionAnswer(String question, String givenAnswer, String correctAnswer) {
		super();
		this.question = question;
		this.givenAnswer = givenAnswer;
		this.correctAnswer = correctAnswer;
	}
	// Getters, Setters
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getGivenAnswer() {
		return givenAnswer;
	}
	public void setGivenAnswer(String givenAnswer) {
		this.givenAnswer = givenAnswer;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
    
    
}