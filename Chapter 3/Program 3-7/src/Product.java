/*
 * Zach Panzarino
 * 10/1/15
 * Program 3.7 - holds a product's data
 */

public class Product {
	private String name;
	private double price;
	public Product(String prodName, double prodPrice){
		name = prodName;
		price = prodPrice;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public void reducePrice(double amount){
		price-=amount;
	}
}
