/*
 * Zach Panzarino
 * 9/30/15
 * Program 3-4 - tests the employee class
 */

public class EmployeeTester {
	public static void main(String[] args){
		Employee zach = new Employee("Panzarino, Zach", 250000);
		System.out.println("Employee name: "+zach.getName());
		System.out.println("Expected name: Panzarino, Zach");
		System.out.println("Salary before raise: $"+zach.getSalary());
		System.out.println("Expected Salary: $250000.0");
		zach.raiseSalary(10);
		System.out.println("Salary after raise: $"+zach.getSalary());
		System.out.print("Expected Salary: $275000.0");
	}
}

/* Program Output
Employee name: Panzarino, Zach
Expected name: Panzarino, Zach
Salary before raise: $250000.0
Expected Salary: $250000.0
Salary after raise: $275000.0
Expected Salary: $275000.0
*/