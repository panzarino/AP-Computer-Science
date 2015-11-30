/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.4 - checks if a user enters a yes or no answer
 */

public class YesNoChecker {
	public String Check(String input){
		if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("ok") || input.equalsIgnoreCase("sure") || input.equalsIgnoreCase("why not?"))
			return "OK";
		else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no"))
			return "Terminating";
		else
			return "Bad input";
	}
}
