/*
 * Zach Panzarino
 * 11/12/15
 * Program 5.14 - extra credit - converts from one unit to another
 */

public class UnitConverter {
	private String from, to;
	private double value;
	public static final double INCH_TO_METER = 0.0254, FOOT_TO_METER = 0.305, MILE_TO_METER = 1609;
	public UnitConverter(String cfrom, String cto, double val){
		from = cfrom;
		to = cto;
		value = val;
	}
	public String convert(){
		double convfrom;
		switch(from){
			case "in":
				convfrom = value*INCH_TO_METER;
				break;
			case "ft":
				convfrom = value*FOOT_TO_METER;
				break;
			case "mi":
				convfrom = value*MILE_TO_METER;
				break;
			case "mm":
				convfrom = value/1000;
				break;
			case "cm":
				convfrom = value/100;
				break;
			case "m":
				convfrom = value;
				break;
			case "km":
				convfrom = value*1000;
				break;
			default:
				return "Error, measurements can only be in in, ft, mi, mm, cm, m, km";
		}
		switch(to){
			case "in":
				return ""+(convfrom/INCH_TO_METER);
			case "ft":
				return ""+(convfrom/FOOT_TO_METER);
			case "mi":
				return ""+(convfrom/MILE_TO_METER);
			case "mm":
				return ""+(convfrom*1000);
			case "cm":
				return ""+(convfrom*100);
			case "m":
				return ""+(convfrom);
			case "km":
				return ""+(convfrom/1000);
			default:
				return "Error, measurements can only be in in, ft, mi, mm, cm, m, km";
		}
	}
}
