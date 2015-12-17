/*
 * Zach Panzarino
 * 11/24/15
 * Fun Number - looping over numbers
 */

public class FunNumber{
	private int original;
	private String str;
	/**
	* constructs a FunNumber with value num
	*/
	public FunNumber(int num) {
		original = num;
		str = Integer.toString(original);
	}
	/**
	 * counts the digits in this FunNumber value
	 * @return the number of the digits
	 */
	public int numDigits(){
		return str.length();
	}
	/**
	 * sums the digits in this FunNumber value
	 * pre-condition: number cannot be negative
	 * @return the sum of the digits
	 */
	public int sumDigits(){
		int total = 0;
		for (int x=this.numDigits()-1; x>=0; x--){
    		total += Integer.parseInt(str.substring(x,x+1));
    	}
    	return total;
    }
	/**
     * sums the integers that are less than or equal to this FunNumber value
     * pre-condition: number cannot be negative
     * @return the sum of the integers <= this FunNumber value
     */
	public int sumInts(){
		int total = 0;
		for (int x=original; x>0; x--)
			total+=x;
		return total;
	}
	/**
	* determines the factorial of this FunNumber value
	* pre-condition: number cannot be negative
	* @return this FunNumber value's factorial
	*/
	public long findFactorial(){
		long total = 1;
		for (int x=original; x>0; x--)
			total*=x;
		return total;
	}
	/**
	* prints all of the factors of this FunNumber value
	* pre-condition: number cannot be negative
	*/
	public void printFactors(){
		int half = original/2;
		for (int x=1; x<=half; x++){
			if (original%x==0){
				System.out.print(x+", ");
			}
		}
		System.out.println(original);
	}
	/**
	* determines if this FunNumber value is prime
	* pre-condition: number cannot be negative
	* @return true if this value is prime, false otherwise
	*/
	public boolean isPrime(){
		int half = original/2;
		for (int x=half; x>1; x--){
			if (original%x==0){
				return false;
			}
		}
		return true;
	}
	/**
	* returns true if this FunNumber value is a "perfect" number
	* a perfect number is a number that has a sum of proper factors
	* equal to the value of this number. 6 is a perfect number
	* because 6 = 1 + 2 + 3.
	* pre-condition: number cannot be negative
	* @return true if this FunNumber value is a perfect number, false otherwise.
	*/
	public boolean isPerfect(){
		int sum = 0;
		int half = original/2;
		for (int x=half; x>0; x--){
			if (original%x==0){
				sum+=x;
			}
		}
		if (sum==original)
			return true;
		return false;
	}
	/**
	 * returns a number that is the reverse of this FunNumber
	 * pre-condition: number cannot be negative
	 * @return reverse of this FunNumber
	 */
	public int reverseNum(){
		String end = "";
		for (int x=str.length()-1; x>=0; x--){
			end += str.substring(x, x+1);
		}
		return Integer.parseInt(end);
	}
	/**
	* returns the value of this FunNumber
	* @return value of this FunNumber
	*/
	public int getValue(){
		return original;
	}
	/**
	 * returns the sum of this FunNumber value and n
	 * @return sum of n and this FunNumber value
	 */
	public int getSum(int n){
		return n + getValue();
	}
}
