package models;

public class Question {

	private String text;
	
	private String[] options;
	
	private float answer;
	
	public float order;
	
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String[] getOptions() {
		return options;
	}
	
	public void setOptions(String[] options) {
		this.options = options;
	}
	
	public float getAnswer() {
		return answer;
	}
	
	public void setAnswer(float answer) {
		this.answer = answer;
	}
	
	public Question(String text, String[] options, float answer) {
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
	
	public boolean checkAnswer(float choice) {
		return (choice == this.answer);
	}
	
	
	
}
