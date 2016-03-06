/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.4 - person class
*/

public class Student extends Person {
    private String major;
    public Student(String name, int year, String studentMajor){
        super(name, year);
        major = studentMajor;
    }
    public String toString(){
        return super.toString() + " and has a major of " + major;
    }
}