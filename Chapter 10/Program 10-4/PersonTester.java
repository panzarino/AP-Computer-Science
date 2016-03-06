/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.4 - person class
*/

public class PersonTester {
    public static void main(String[] args){
        Person person = new Person("Tom Jones", 1995);
        Student student = new Student("Chrissie Smith", 1992, "Math");
        Instructor instructor = new Instructor("Rick Mercer", 1960, 1000000);
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}

/* Program Output
Tom Jones was born in 1995
Chrissie Smith was born in 1992 and has a major of Math
Rick Mercer was born in 1960 and has a salary of $1,000,000.00
*/