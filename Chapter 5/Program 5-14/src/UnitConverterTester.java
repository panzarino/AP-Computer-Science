/*
 * Zach Panzarino
 * 11/12/15
 * Program 5.14 - extra credit - tests the unit converter class
 */

import java.util.Scanner;
public class UnitConverterTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Measurements can only be in in, ft, mi, mm, cm, m, km");
		System.out.print("Convert from: ");
		String from = scan.next();
		System.out.print("Convert to: ");
		String to = scan.next();
		System.out.print("Value: ");
		double val = scan.nextDouble();
		UnitConverter c = new UnitConverter(from, to, val);
		if (c.convert().equals("Error, measurements can only be in in, ft, mi, mm, cm, m, km"))
			System.out.println(c.convert());
		else
			System.out.println(val+" "+from+" = "+c.convert()+" "+to);
		System.out.println("Test 1 expected result: 2.54");
		System.out.println("Test 2 expected result: 10.0");
		System.out.println("Test 3 expected result: 5275");
		System.out.println("Test 4 expected result: error");
	}
}

/* Program Output
Measurements can only be in in, ft, mi, mm, cm, m, km
Convert from: in
Convert to: cm
Value: 1
1.0 in = 2.54 cm
Test 1 expected result: 2.54
Test 2 expected result: 10.0
Test 3 expected result: 5275
Test 4 expected result: error

Measurements can only be in in, ft, mi, mm, cm, m, km
Convert from: km
Convert to: km
Value: 10
10.0 km = 10.0 km
Test 1 expected result: 2.54
Test 2 expected result: 10.0
Test 3 expected result: 5275
Test 4 expected result: error

Measurements can only be in in, ft, mi, mm, cm, m, km
Convert from: mi
Convert to: ft
Value: 1
1.0 mi = 5275.4098360655735 ft
Test 1 expected result: 2.54
Test 2 expected result: 10.0
Test 3 expected result: 5275
Test 4 expected result: error

Measurements can only be in in, ft, mi, mm, cm, m, km
Convert from: f
Convert to: t
Value: 10
Error, measurements can only be in in, ft, mi, mm, cm, m, km
Test 1 expected result: 2.54
Test 2 expected result: 10.0
Test 3 expected result: 5275
Test 4 expected result: error
*/