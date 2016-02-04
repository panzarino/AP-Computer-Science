/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.1 - working with data sets
 */

public class DieSimulator{
    public static void main(String[] args){
        Die die = new Die(6);
        DataSet set = new DataSet();
        for (int x=1; x<=10; x++){
            System.out.println("Roll "+x+" value: "+die.cast());
            set.add(die);
        }
        System.out.println("Average: "+set.getAverage());
    }
}

/* Program Output
Roll 1 value: 6
Roll 2 value: 1
Roll 3 value: 2
Roll 4 value: 5
Roll 5 value: 1
Roll 6 value: 3
Roll 7 value: 6
Roll 8 value: 4
Roll 9 value: 4
Roll 10 value: 3
Average: 3.5

Roll 1 value: 5
Roll 2 value: 3
Roll 3 value: 2
Roll 4 value: 2
Roll 5 value: 6
Roll 6 value: 1
Roll 7 value: 6
Roll 8 value: 1
Roll 9 value: 1
Roll 10 value: 3
Average: 3.0

Roll 1 value: 2
Roll 2 value: 2
Roll 3 value: 3
Roll 4 value: 3
Roll 5 value: 3
Roll 6 value: 6
Roll 7 value: 2
Roll 8 value: 6
Roll 9 value: 6
Roll 10 value: 6
Average: 3.9
*/