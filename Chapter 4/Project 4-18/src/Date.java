/*
 * Zach Panzarino
 * 10/26/15
 * Program 4.18 - calculates the date of easter sunday
 */

public class Date {
	private int y;
	private int n;
	private int p;
	public Date(int year){
		y = year;
		n=0;
		p=0;
	}
	public void calculate(){
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		n = (h-m+r+90)/25;
		p = (h-m+r+n+19)%32;
	}
	private static String getName(int num){
		String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
		return months.substring(10*(num-1), 10*(num-1)+10).trim();
	}
	public String getEasterSundayMonth(){
		return getName(n);
	}
	public int getEasterSundayDay(){
		return p;
	}
}
