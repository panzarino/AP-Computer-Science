/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.12 - sorting peoples
*/

import java.util.Scanner;
import java.util.ArrayList;
public class PersonDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();
        String name;
        while (true) {
            System.out.print("Enter name or blank to quit: ");
            name = scan.nextLine();
            if (name.equals("")){
                break;
            }
            list.add(new Person(name));
        }
        Person first = list.get(0), last = list.get(0);
        for (Person x: list){
            if (x.compareTo(first) < 0)
                first = x;
            else if (x.compareTo(last) > 0)
                last = x;
        }
        System.out.println("First: "+first.getName());
        System.out.println("Last: "+last.getName());
    }
}

/* Program Output
Enter name or blank to quit: Tom
Enter name or blank to quit: Dick
Enter name or blank to quit: Harry
Enter name or blank to quit: Romeo
Enter name or blank to quit: Juliet
Enter name or blank to quit: 
First: Dick
Last: Tom
*/