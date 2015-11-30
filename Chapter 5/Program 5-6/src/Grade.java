/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.6 - converts a GPA into a letter grade
 */

public class Grade {
	private double grade;
	public Grade(double g){
		grade = g;
	}
	public String getLetterGrade(){
		if (grade>4 || grade<0)
			return "Invalid grade entered";
		else if (grade>=3.85)
			return "A";
		else if (grade>=3.5)
			return "A-";
		else if (grade>=3.15)
			return "B+";
		else if (grade>=2.85)
			return "B";
		else if (grade>=2.5)
			return "B-";
		else if (grade>=2.15)
			return "C+";
		else if (grade>=1.85)
			return "C";
		else if (grade>=1.5)
			return "C-";
		else if (grade>=1.15)
			return "D+";
		else if (grade>=0.85)
			return "D";
		else if (grade>=0.35)
			return "D-";
		else if (grade<0.35)
			return "F";
		else
			return "Invalid grade entered";
	}
}
