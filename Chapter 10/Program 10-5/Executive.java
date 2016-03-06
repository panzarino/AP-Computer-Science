/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.5 - creating employees
*/

public class Executive extends Manager {
    public Executive(String name, double salary, String d){
        super(name, salary, d);
    }
    public String toString(){
        return "Executive " + super.toString();
    }
}