/*
 * Zach Panzarino
 * 11/9/15
 * Program 5.2 - creates a playing card
 */

public class Card {
	private String card;
	public Card(String cardfmt){
		card = cardfmt;
	}
	public String getDescription(){
		String num, suit, output;
		if(card.substring(0, 2).equals("10")){
			num = "10";
			suit = card.substring(2);
		}
		else{
			num = card.substring(0,1);
			suit = card.substring(1);
		}
		switch(num){
			case "2":
				output = "2";
				break;
			case "3":
				output = "3";
				break;
			case "4":
				output = "4";
				break;
			case "5":
				output = "5";
				break;
			case "6":
				output = "6";
				break;
			case "7":
				output = "7";
				break;
			case "8":
				output = "8";
				break;
			case "9":
				output = "9";
				break;
			case "10":
				output = "10";
				break;
			case "A":
				output = "Ace";
				break;
			case "J":
				output = "Jack";
				break;
			case "Q":
				output = "Queen";
				break;
			case "K":
				output = "King";
				break;
			default:
				output = "Unknown";
				break;
		}
		if (!output.equals("Unknown")){
			switch(suit){
				case "D":
					output += " of Diamonds";
					break;
				case "H":
					output += " of Hearts";
					break;
				case "S":
					output += " of Spades";
					break;
				case "C":
					output += " of Clubs";
					break;
				default:
					output = "Unknown";
			}
		}
		return output;
	}
}
