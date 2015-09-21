/*
 * Zach Panzarino
 * 9/18/15
 * Project 2.1 - uses calendar classes to create multiple date objects
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
public class CalendarProgram {
	public static void main(String[] args){
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.println();
		System.out.println("Today's Date: "+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR));
		cal.add(Calendar.DAY_OF_YEAR, 100);
		System.out.println("Date 100 days from today: "+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR));
		System.out.println("Expected date 100 days from today: 12/27/2015");
		GregorianCalendar birthday = new GregorianCalendar(1999,Calendar.APRIL,12);
		System.out.println("My Birthday: "+(birthday.get(Calendar.MONTH)+1)+"/"+birthday.get(Calendar.DAY_OF_MONTH)+"/"+birthday.get(Calendar.YEAR));
		System.out.println("Day of the week of my birthday: "+birthday.get(Calendar.DAY_OF_WEEK));
		System.out.println("Expected day of the week of my birthday: 2");
		birthday.add(Calendar.DAY_OF_YEAR, 10000);
		System.out.println("The date 10,000 days from my birthday: "+(birthday.get(Calendar.MONTH)+1)+"/"+birthday.get(Calendar.DAY_OF_MONTH)+"/"+birthday.get(Calendar.YEAR));
		System.out.println("Expected date 1000 days from my birthday: 8/28/2026");
	}
}

/* Program Output
java.util.GregorianCalendar[time=1442600605149,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2015,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=18,DAY_OF_YEAR=261,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=23,SECOND=25,MILLISECOND=149,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]

Today's Date: 9/18/2015
Date 100 days from today: 12/27/2015
Expected date 100 days from today: 12/27/2015
My Birthday: 4/12/1999
Day of the week of my birthday: 2
Expected day of the week of my birthday: 2
The date 10,000 days from my birthday: 8/28/2026
Expected date 1000 days from my birthday: 8/28/2026
*/