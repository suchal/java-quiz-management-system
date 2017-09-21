package controllers;
import models.User;
import views.LoginView;
public class LoginController {

	private LoginView loginView;
	private User student;
	private User instructor;
	
	
	public LoginController() {
//		super();
		this.loginView = new LoginView();

		this.student = new User("suchal", "password", "student", 0);
		this.instructor = new User("fahad", "password", "instructor", 0);
	}


	public User index() {
		while(true) {
			String[] data = this.loginView.getUsernamePassword();
			if(this.student.login(data[0], data[1])) {
				//student here
				return this.student;
			}
			else if(this.instructor.login(data[0], data[1])) {
				//instructor here
				return this.instructor;
			}
			
		}
	}
}
