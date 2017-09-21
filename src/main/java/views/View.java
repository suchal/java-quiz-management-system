package views;

import java.util.Scanner;

public class View {
	protected Scanner scanner;
	
	public View() {
		this.scanner = new Scanner(System.in);
	}
	
	protected float inputFloat() {
		while(true) {
	       try
	        {
	            float amount = this.scanner.nextFloat();
	            return amount;
	        } 
	        catch (java.util.InputMismatchException e)
	        {
	        	System.out.println("Please enter a valid value");
	            this.scanner.nextLine();
	        }
		}
	}
	
	protected String inputString() {
		while(true) {
	       try
	        {
	            String str = this.scanner.next();
	            return str;
	        } 
	        catch (java.util.InputMismatchException e)
	        {
	        	System.out.println("Please enter a valid value");
	            this.scanner.nextLine();
	        }
		}
	}
}
