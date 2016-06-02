/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.12 - sorting peoples
*/

public class Person implements Comparable {
    private String name;
    public Person(String aName) {
        name = aName;
    }
    public int compareTo(Object otherObject){
        Person other = (Person) otherObject;
        return getName().compareTo(other.getName());
    }
    public String getName(){
        return name;
    }
    public String toString(){
   		return "Person[name=" + name + "]";
   	}
}