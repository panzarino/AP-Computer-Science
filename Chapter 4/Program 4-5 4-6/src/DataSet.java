/*
 * Zach Panzarino
 * 10/16/15
 * Programs 4.5 & 4.6 - creates a data set that computes statistics for set of numbers
 */

public class DataSet {
	private int count;
	private int sum;
	private int largest;
	private int smallest;
	public DataSet(){
		count = 0;
		sum = 0;
		largest = Integer.MIN_VALUE;
		smallest = Integer.MAX_VALUE;
	}
	public void addValue(int val){
		count++;
		sum+=val;
		largest=Math.max(val, largest);
		smallest=Math.min(val, smallest);
	}
	public int getSum(){
		return sum;
	}
	public double getAverage(){
		return ((double)(sum))/count;
	}
	public int getLargest(){
		return largest;
	}
	public int getSmallest(){
		return smallest;
	}
}
