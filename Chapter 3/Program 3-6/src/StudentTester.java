/*
 * Zach Panzarino
 * 9/30/15
 * Program 3.6 - tests the student class that stores quiz data
 */

public class StudentTester {
	public static void main(String[] args){
		Student student = new Student("Panzarino, Zach");
		student.addQuiz(100);
		student.addQuiz(92);
		student.addQuiz(96);
		System.out.println("Student name: "+student.getName());
		System.out.println("Expected student name: Panzarino, Zach");
		System.out.println("Total quiz points: "+student.getTotalScore());
		System.out.println("Expected total quiz points: 288.0");
		System.out.println("Total quizzes taken: "+student.getQuizzesTaken());
		System.out.println("Expected quizzes taken: 3");
		System.out.println("Average quiz score: "+student.getAverageScore());
		System.out.print("Expected average score: 96.0");
	}
}

/* Program Output
Student name: Panzarino, Zach
Expected student name: Panzarino, Zach
Total quiz points: 288.0
Expected total quiz points: 288.0
Total quizzes taken: 3
Expected quizzes taken: 3
Average quiz score: 96.0
Expected average score: 96.0
*/