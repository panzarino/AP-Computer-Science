/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.5 - creating employees
*/

public class EmployeeTester {
    public static void main(String[] args){
        Employee employee = new Employee("Joe Schmo", 39500);
        Manager manager = new Manager("Helen Hayes", 66050, "Payroll");
        Executive executive = new Executive("Rick Mercer", 1000000, "Software");
        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}

/* Program Output
Employee Joe Schmo has a salary of $39,500.00
Employee Helen Hayes has a salary of $66,050.00 and is the manager of the Payroll department
Executive Employee Rick Mercer has a salary of $1,000,000.00 and is the manager of the Software department
*/