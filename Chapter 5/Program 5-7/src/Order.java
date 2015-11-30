/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.7 - orders strings by lexicographic order
 */

public class Order {
	private String s1, s2, s3;
	public Order(String n1, String n2, String n3){
		s1 = n1;
		s2 = n2;
		s3 = n3;
	}
	public String first(){
		if (s1.compareTo(s2)<=0)
			return s1;
		else if (s2.compareTo(s3)<=0)
			return s2;
		else
			return s3;
	}
	public String last(){
		String first = this.first();
		if (first.equals(s1)){
			if (s2.compareTo(s3)>=0)
				return s2;
			else
				return s3;
		}
		else if (first.equals(s2)){
			if (s1.compareTo(s3)>=0)
				return s1;
			else
				return s3;
		}
		else{
			if (s1.compareTo(s2)>=0)
				return s1;
			else
				return s2;
		}
	}
	public String middle(){
		String first = this.first();
		String last = this.last();
		if ((first.equals(s1) && last.equals(s2)) || (first.equals(s2) && last.equals(s1)))
			return s3;
		else if ((first.equals(s3) && last.equals(s2)) || (first.equals(s2) && last.equals(s3)))
			return s1;
		else
			return s2;
	}
}
