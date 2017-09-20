package views;
import java.util.Scanner;  
public class LoginView {
	private Scanner scanner;
	
	public LoginView() {
		this.scanner = new Scanner(System.in);
	}
	
	public String[] getUsernamePassword() {
		String[] data = {"suchal", "password"};
		return data;
	}
}
