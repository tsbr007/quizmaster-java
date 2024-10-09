package com.quizmaster.quizmaster;

import java.util.List;

public class QuizSubmission {
    private Long quizId;
    private List<QuestionAnswer> questionAnswers;
    // Getters, Setters
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	public List<QuestionAnswer> getQuestionAnswers() {
		return questionAnswers;
	}
	public void setQuestionAnswers(List<QuestionAnswer> questionAnswers) {
		this.questionAnswers = questionAnswers;
	}
    
    
}
