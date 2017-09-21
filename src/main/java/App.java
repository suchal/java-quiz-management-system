import controllers.LoginController;
import models.User;
import controllers.InstructorController;

public class App {
	
	private LoginController loginController;
	private InstructorController instructorController;
	public User currentUser;
	
	
	App() {
		
		this.instructorController = new InstructorController();
		this.loginController = new LoginController();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App $app = new App();
		
		
		$app.currentUser = $app.loginController.index();
		System.out.println("Welcome "+$app.currentUser.getUsername());
		if($app.currentUser.getRole().equals("student")) {
			
		}else if($app.currentUser.getRole().equals("instructor")) {
			$app.instructorController.index($app.currentUser);
		}
	}

}
