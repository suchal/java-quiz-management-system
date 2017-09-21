package views;

import models.Question;

public class InstructorView extends View{

	public InstructorView() {
		super();
	}
	
	public int menu() {
		System.out.println("Please enter an option:");
		System.out.println("(1) Add a quiz");
		System.out.println("(2) Edit a quiz");
//		System.out.println("Please enter an option:");
//		System.out.println("Please enter an option:");
		return (int)this.inputFloat();
		
	}
	
	public String[] addQuiz() {
		String[] data = new String[2];
		System.out.println("Please enter title of the quiz: ");
		data[0] = this.inputString();
		System.out.println("Please enter description of the quiz: ");
		data[1] = this.inputString();
		return data;
	}
	
	public int editQuiz() {
		System.out.println("Please select the options:");
		System.out.println("(0) Add a new question");
//		System.out.println("Rearrange a question");
//		System.out.println("Please select the options:");
		int option = (int) this.inputFloat();
		return option;
		
	}
	
	public Question addQuestion() {
		System.out.println("Please enter the question statement");
		String text = this.inputString();
		System.out.println("Please enter the question Type");
		System.out.println("(1) MCQ");
		System.out.println("(2) True/False Question");
		System.out.println("(3) Numeric Question");
		int type = (int)this.inputFloat();
		String[] choices = new String[4];
		float answer = 1;
		switch(type) {
		case(1):
			
			for(int i = 1; i<=4; i++) {
				System.out.println("Enter the option ("+i+")");
				choices[i-1] = this.inputString();
			}
			System.out.println("Please enter the correct answer");
			answer = this.inputFloat();
		break;
		case(2):
			choices[0] = "True";
			choices[1] = "False";
			System.out.println("Please enter the correct answer");
			System.out.println("(1) True");
			System.out.println("(2) False");
			answer = this.inputFloat();
		break;
		case(3):
			System.out.println("Please enter the correct answer");
			answer = this.inputFloat();
		}
		Question question = new Question(text, choices, answer);
		return question;
		
		
	}
}
