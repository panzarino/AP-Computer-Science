/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.5 - creating employees
*/

import java.text.NumberFormat;
public class Employee {
    private String name;
    private double salary;
    public Employee(String n, double s){
        name = n;
        salary = s;
    }
    public String toString(){
        return "Employee " + name + " has a salary of " + NumberFormat.getCurrencyInstance().format(salary);
    }
}