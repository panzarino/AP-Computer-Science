/*
 * Zach Panzarino
 * 10/16/15
 * Programs 4.5 & 4.6 - tests the data set class
 */

public class DataSetTester {
	public static void main(String[] args){
		DataSet data = new DataSet();
		data.addValue(12);
		data.addValue(34);
		data.addValue(55);
		data.addValue(7);
		System.out.println("Sum of the numbers: "+data.getSum());
		System.out.println("Average of the numbers: "+data.getAverage());
		System.out.println("Largest of the numbers: "+data.getLargest());
		System.out.println("Smallest of the numbers: "+data.getSmallest());
		System.out.println("Expected sum: 108");
		System.out.println("Expected average: 27.0");
		System.out.println("Expected largest: 55");
		System.out.println("Expected smallest: 7");
	}
}

/* Program Output
Sum of the numbers: 108
Average of the numbers: 27.0
Largest of the numbers: 55
Smallest of the numbers: 7
Expected sum: 108
Expected average: 27.0
Expected largest: 55
Expected smallest: 7
*/