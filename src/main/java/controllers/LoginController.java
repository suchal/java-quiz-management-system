package controllers;
import models.User;
import views.LoginView;
public class LoginController {

	private LoginView loginView;
	private User student = new User("suchal", "password", "student", 0);
	private User instructor = new User("fahad", "password", "instructor", 0);
	
	
	public LoginController(User student, User instructor) {
//		super();
		this.loginView = new LoginView();
		this.student = student;
		this.instructor = instructor;
	}

	public void index() {
		this.loginView.getUsernamePassword();
	}
}
