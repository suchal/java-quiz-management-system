package views;
  
public class LoginView extends View {

	public LoginView() {
		super();
	}
	
	public String[] getUsernamePassword() {
		String[] data = {"suchal", "password"};
		System.out.println("Welcome to Quiz Software");
		System.out.println("Please Enter Your Username");
		data[0] = this.scanner.next().toString();
		System.out.println("Please enter your password");
		data[1] = this.scanner.next().toString();
		System.out.println(data[0]+" "+data[1]);
		return data;
	}
	

}
