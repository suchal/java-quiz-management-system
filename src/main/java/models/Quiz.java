package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Quiz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3360741659380750242L;
	private String title;
	private String description;
	private List <Question> questions;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Quiz(String title, String description) {
		this.title = title;
		this.description = description;
		this.questions =  new ArrayList <Question> ();;
	}
	
	public void addQuestion(Question question) {
		question.order = this.questions.size();
//		System.out.println(question.order);
		this.questions.add(question);
	}
	
	public static void Save(List<Quiz> quizes) {
	      try {
	          FileOutputStream fileOut =
	          new FileOutputStream("quizes.");
	          ObjectOutputStream out = new ObjectOutputStream(fileOut);
	          out.writeObject(quizes);
	          out.close();
	          fileOut.close();
	          System.out.printf("Serialized data is saved in /tmp/employee.ser");
	       }catch(IOException i) {
	          i.printStackTrace();
	       }
	}
	
}
