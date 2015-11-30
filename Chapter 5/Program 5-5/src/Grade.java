/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.5 - converts a letter grade into a GPA average
 */

public class Grade {
	private String grade;
	public Grade(String g){
		grade = g;
	}
	public String getNumericGrade(){
		switch(grade){
			case "A+":
				return "4.0";
			case "A":
				return "4.0";
			case "A-":
				return "3.7";
			case "B+":
				return "3.3";
			case "B":
				return "3.0";
			case "B-":
				return "2.7";
			case "C+":
				return "2.3";
			case "C":
				return "2.0";
			case "C-":
				return "1.7";
			case "D+":
				return "1.3";
			case "D":
				return "1.0";
			case "D-":
				return "0.7";
			case "F":
				return "0.0";
			default:
				return "Invalid grade entered";
		}
	}
}
