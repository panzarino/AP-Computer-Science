/*
 * Zach Panzarino
 * 11/9/15
 * Program 5.3 - sorts 3 floating point numbers
 */

import java.util.Scanner;
public class Sort {
	private double num1, num2, num3;
	public Sort(double n1, double n2, double n3){
		num1 = n1;
		num2 = n2;
		num3 = n3;
	}
	public double getLargest(){
		if (num1>=num2 && num1>=num3)
			return num1;
		else if (num2>=num3)
			return num2;
		else
			return num3;
	}
	public double getSmallest(){
		if (num1<=num2 && num1<=num3)
			return num1;
		else if (num2<=num3)
			return num2;
		else
			return num3;
	}
	public double getMiddle(){
		double largest = this.getLargest();
		double smallest = this.getSmallest();
		if ((largest==num1 && smallest==num2) || (largest==num2 && smallest==num1))
			return num3;
		else if ((largest==num2 && smallest==num3) || (largest==num3 && smallest==num2))
			return num1;
		else
			return num2;
	}
		/* if (num1<=num2 && num1<=num3){
			System.out.println(num1);
			if (num2<=num3){
				System.out.println(num2);
				System.out.println(num3);
			}
			else{
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		else{
			if (num2<=num1 && num2<=num3){
				System.out.println(num2);
				if (num1<=num3){
					System.out.println(num1);
					System.out.println(num3);
				}
				else{
					System.out.println(num3);
					System.out.println(num1);
				}
			}
			else{
				System.out.println(num3);
				if (num1<=num2){
					System.out.println(num1);
					System.out.println(num2);
				}
				else{
					System.out.println(num2);
					System.out.println(num1);
				}
			}
		}
		*/
}

/* Program Output
Enter the three numbers: 
1
2
3
1.0
2.0
3.0
All tests expected results: 1 2 3

Enter the three numbers: 
1
3
2
1.0
2.0
3.0
All tests expected results: 1 2 3

Enter the three numbers: 
2
1
3
1.0
2.0
3.0
All tests expected results: 1 2 3

Enter the three numbers: 
2
3
1
1.0
2.0
3.0
All tests expected results: 1 2 3

Enter the three numbers: 
3
1
2
1.0
2.0
3.0
All tests expected results: 1 2 3

Enter the three numbers: 
3
2
1
1.0
2.0
3.0
All tests expected results: 1 2 3
*/