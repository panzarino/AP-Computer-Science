/*
 * Zach Panzarino
 * 11/18/15
 * Testing Loops - playing around with the different types of loops
 */

public class TestingLoops {
	public static void main(String[] args){
		// braces allows each problem to be evaluated as single statement
		// allows re-initialization of variables
 		System.out.println("====1======");
 		{
 			for (int x=-2;x<=2;x++)
 				System.out.println(x*x);
 		}
 		System.out.println("\n====2======");
 		{
 			for (int x=1; x<=5; x++){
 				System.out.println(x);
 				for (int y=1; y<=x; y++){
 					System.out.print(y);
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====3======");
 		{
 			for (int x=1; x<=2; x++)
 				for (int y = 1; y<=2; y++)
 					for (int z = 1; z <= 2; z++)
 						System.out.println(x+" "+y+" "+z);
 		}
 		System.out.println("\n====4======");
 		{
 			for (int d=1; d<=4; d++){
 				System.out.println();
 				for (int a=1; a<=d; a++){
 					System.out.print("*");
 				}
 			}
 			System.out.println();
 		}
 		System.out.println("\n====5======");
 		{
 			int sum = 0;
 			for (int x=1; x<=10; x++)
 				sum+=x;
 			System.out.println("Sum is: "+sum);
 		}
 		System.out.println("\n====5=(while)======");
 		{
 			int sum = 0, x = 1;
 			while (x<=10)
 				sum+=x++;
 			System.out.println("Sum is: "+sum);
 		}
 		System.out.println("\n====5=(do while)======");
 		{
 			int sum = 0, x = 1;
 			do
 				sum+=x++;
 			while (x<=10);
 			System.out.println("Sum is: "+sum);
 		}
 		System.out.println("\n====6======");
 		{
 			int x=0;
 			do{
 				x+=1;
 				System.out.print(x+" ");
 			} while (x<=20);
 		}
 		System.out.println("\n====6=(while)======");
 		{
 			int x=0;
 			while(x<=20)
 				System.out.print(++x+" ");
 		}
 		System.out.println("\n====6=(for)======");
 		{
 			for (int x=1; x<=21; x++)
 				System.out.print(x+" ");
 		}
 		System.out.println("\n====7======");
 		{
 			int x=2;
 			while(x<=30){
 				System.out.print(x+ " ");
 				x += 2;
 			}
 		}
 		System.out.println("\n====7=(do while)======");
 		{
 			int x=2;
 			do {
 				System.out.print(x+ " ");
 				x+=2;
 			} while (x<=30);
 		}
 		System.out.println("\n====7=(for)======");
 		{
 			for (int x=2; x<=30; x+=2)
 				System.out.print(x+ " ");
 		}
 		System.out.println("\n====8a======");
 		{
 			for (int x=0; x<=3; x++){
 				for (int y=0; y<=x; y++){
 					System.out.print("*");
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8b======");
 		{
 			for (int x=3; x>=0; x--){
 				for (int y=0; y<=x; y++){
 					System.out.print("*");
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8c======");
 		{
 			for (int x=3; x>=0; x--){
 				for (int y=0; y<3-x; y++){
 					System.out.print(" ");
 				}
 				for (int y=0; y<=x; y++){
 					System.out.print("*");
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8d======");
 		{
 			for (int x=1; x<=4; x++){
 				for (int y=1; y<=x; y++){
 					System.out.print(y);
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8e======");
 		{
 			for (int x=4; x>=1; x--){
 				for (int y=0; y<x; y++){
 					System.out.print(x);
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8f======");
 		{
 			for (int x=4; x>=1; x--){
 				for (int y=x; y>0; y--){
 					System.out.print(5-y);
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8g======");
 		{
 			for (int x=1; x<=4; x++){
 				for (int y=x-1; y>0; y--){
 					System.out.print(" ");
 				}
 				for (int y=1; y<=5-x; y++){
 					System.out.print(x+" ");
 				}
 				System.out.println();
 			}
 		}
 		System.out.println("\n====8h======");
 		{
 			for (int x=1; x<=4; x++){
 				for (int y=x-1; y>0; y--){
 					System.out.print(" ");
 				}
 				for (int y=1; y<=5-x; y++){
 					System.out.print(y+" ");
 				}
 				System.out.println();
 			}
 		}
	}
}

/* Program Output
====1======
4
1
0
1
4

====2======
1
1
2
12
3
123
4
1234
5
12345

====3======
1 1 1
1 1 2
1 2 1
1 2 2
2 1 1
2 1 2
2 2 1
2 2 2

====4======

*
**
***
****

====5======
Sum is: 55

====5=(while)======
Sum is: 55

====5=(do while)======
Sum is: 55

====6======
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 
====6=(while)======
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 
====6=(for)======
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 
====7======
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
====7=(do while)======
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
====7=(for)======
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
====8a======
*
**
***
****

====8b======
****
***
**
*

====8c======
****
 ***
  **
   *

====8d======
1
12
123
1234

====8e======
4444
333
22
1

====8f======
1234
234
34
4

====8g======
1 1 1 1 
 2 2 2 
  3 3 
   4 

====8h======
1 2 3 4 
 1 2 3 
  1 2 
   1 
*/