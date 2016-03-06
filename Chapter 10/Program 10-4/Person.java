/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.4 - person class
*/

public class Person {
    private String name;
    private int year;
    public Person(String personName, int birthYear){
        name = personName;
        year = birthYear;
    }
    public String toString(){
        return name + " was born in " + year;
    }
}