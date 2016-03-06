/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.4 - person class
*/

import java.text.NumberFormat;
public class Instructor extends Person {
    private double salary;
    public Instructor(String name, int year, double instructorSalary){
        super(name, year);
        salary = instructorSalary;
    }
    public String toString(){
        return super.toString() + " and has a salary of " + NumberFormat.getCurrencyInstance().format(salary);
    }
}