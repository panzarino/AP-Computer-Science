/*
 * Zach Panzarino
 * 9/30/15
 * Program 3.6 - class to contain student quiz data
 */

public class Student {
	private String name;
	private int numQuiz;
	private double totScore;
	public Student(String studentName){
		name = studentName;
		numQuiz = 0;
		totScore = 0;
	}
	public String getName(){
		return name;
	}
	public void addQuiz(int score){
		totScore+=score;
		numQuiz++;
	}
	public double getTotalScore(){
		return totScore;
	}
	public int getQuizzesTaken(){
		return numQuiz;
	}
	public double getAverageScore(){
		return (totScore/numQuiz);
	}
}
