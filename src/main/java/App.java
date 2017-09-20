import controllers.LoginController;
import models.User;
public class App {
	
	private LoginController loginController;
	private User student = new User("suchal", "password", "student", 0);
	private User instructor = new User("fahad", "password", "instructor", 0);
	
	
	
	App() {
		
		this.student = new User("suchal", "password", "student", 0);
		this.instructor = new User("fahad", "password", "instructor", 0);
		this.loginController = new LoginController(this.student, this.instructor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App $app = new App();
		
		$app.loginController.index();
	}

}
