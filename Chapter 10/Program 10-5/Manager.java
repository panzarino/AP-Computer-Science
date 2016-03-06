/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.5 - creating employees
*/

public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String d){
        super(name, salary);
        department = d;
    }
    public String toString(){
        return super.toString() + " and is the manager of the " + department + " department";
    }
}