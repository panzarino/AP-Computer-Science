/*
 * Zach Panzarino
 * 10/19/15
 * Program 4.12 - breaks apart an integer
 */

public class DigitExtractor {
	private int num;
	public DigitExtractor(int integer){
		num=integer;
	}
	public int nextDigit(){
		int digit = num%10;
		num/=10;
		return digit;
	}
}
