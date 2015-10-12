/*
 * Zach Panzarino
 * 9/30/15
 * Program 3.4 - class to store employee data
 */

public class Employee {
	private String name;
	private double salary;
	public Employee(String employeeName, double currentSalary){
		name = employeeName;
		salary = currentSalary;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void raiseSalary(double byPercent){
		salary*=1+(byPercent*.01);
	}
}
