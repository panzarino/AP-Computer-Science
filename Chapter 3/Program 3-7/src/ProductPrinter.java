/*
 * Zach Panzarino
 * 10/1/15
 * Program 3.7 - tests products and prints their info
 */

public class ProductPrinter {
	public static void main(String[] args){
		Product p1 = new Product("Pencil", 200);
		System.out.println("Product 1\n---------\n");
		System.out.println("Product name and price is: "+p1.getName()+", $"+p1.getPrice());
		p1.reducePrice(5);
		System.out.println("Reduced price is $"+p1.getPrice()+"\n");
		System.out.println("Expected name and price: Pencil, $200.0");
		System.out.println("Expected reduced price: $195.0\n");
		Product p2 = new Product("Eraser", 12);
		System.out.println("Product 2\n---------\n");
		System.out.println("Product name and price is: "+p2.getName()+", $"+p2.getPrice());
		p2.reducePrice(5);
		System.out.println("Reduced price is $"+p2.getPrice()+"\n");
		System.out.println("Expected name and price: Eraser, $12.0");
		System.out.print("Expected reduced price: $7.0");
	}
}

/* Program Output
Product 1
---------

Product name and price is: Pencil, $200.0
Reduced price is $195.0

Expected name and price: Pencil, $200.0
Expected reduced price: $195.0

Product 2
---------

Product name and price is: Eraser, $12.0
Reduced price is $7.0

Expected name and price: Eraser, $12.0
Expected reduced price: $7.0
*/