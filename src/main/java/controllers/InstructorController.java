package controllers;

import views.InstructorView;
import models.User;
import models.Quiz;
import models.Question;

public class InstructorController {

	private InstructorView instructorView;
	
	private User currentUser;
	
	public InstructorController() {
		this.instructorView = new InstructorView();
		
	}
	
	public void index(User $user) {
		this.currentUser = $user;
		while(true) {
			int option = this.instructorView.menu();
			if(option == 1) {
				this.addQuiz();
			}
		}
	}
	
	public void addQuiz() {
		String[] data = this.instructorView.addQuiz();
		Quiz quiz = new Quiz(data[0], data[1]);
		this.editQuiz(quiz);
	}
	
	public void editQuiz(Quiz quiz) {
		int option = this.instructorView.editQuiz();
		while(true) {
			if(option == 0) {
				Question question = this.addQuestion();
				//add that question to that quiz
				quiz.addQuestion(question);
				if(quiz.getQuestions().size() == 10)
					break;
			}
		}
	}
	
	public Question addQuestion() {
		return this.instructorView.addQuestion();
	}

}
