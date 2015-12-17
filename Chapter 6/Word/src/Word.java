/*
 * Zach Panzarino
 * 11/30/15
 * Word - reverses and checks for palindromes
 */

public class Word {
	private String original;
	/**
	 * constructs a Word with String value s
	 * @param s is string value of Word
	 */
	public Word(String s){
		original = s;
	}
	/**
	 * reverses letters in an original string
	 * pre-condition: word cannot be blank
	 * @return a sstring that is a reverse of original
	 */
	public String reverse(){
		String output = "";
		for (int x=original.length()-1;x>=0;x--)
			output += original.substring(x, x+1);
		return output;
	}
	/**
	 * determines if a word is a palindrome
	 * pre-condition: word cannot be blank
	 * @return true if the word is a palindrome, false otherwise
	 */
	public boolean isPalindrome(){
		if (original.equals(this.reverse()))
			return true;
		return false;
	}
	public boolean isPalindrome2(){
		int half = original.length()/2;
		for (int x=0; x<half; x++)
			if (!original.substring(x,  x+1).equals(original.substring(original.length()-x-1, original.length()-x)))
				return false;
		return true;
	}
}
