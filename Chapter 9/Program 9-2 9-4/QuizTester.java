/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.2 and 9.4 - working with data sets
 */

public class QuizTester {
    public static void main(String[] args){
        DataSet set = new DataSet();
        Quiz quiz1 = new Quiz(90, "A-");
        Quiz quiz2 = new Quiz(100, "A+");
        Quiz quiz3 = new Quiz(50, "F");
        Quiz quiz4 = new Quiz(86, "B");
        set.add(quiz1);
        set.add(quiz2);
        set.add(quiz3);
        set.add(quiz4);
        Quiz max = (Quiz) set.getMaximum();
        Quiz min = (Quiz) set.getMinimum();
        System.out.println("Quizzes: "+quiz1.toString()+", "+quiz2.toString()+", "+quiz3.toString()+", "+quiz4.toString());
        System.out.println("Average: "+set.getAverage());
        System.out.println("Maximum: "+max.toString());
        System.out.println("Minimum: "+min.toString());
        System.out.println("Expected Average: 81.5");
        System.out.println("Expected Maximum: 100 A+");
        System.out.println("Expected Minimum: 50 F");
    }
}

/* Program Output
Quizzes: 90.0 A-, 100.0 A+, 50.0 F, 86.0 B
Average: 81.5
Maximum: 100.0 A+
Minimum: 50.0 F
Expected Average: 81.5
Expected Maximum: 100 A+
Expected Minimum: 50 F
*/