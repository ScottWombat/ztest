package ztest;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UTCDatetime {

	public static void main(String[] args) {
		String d = "2016-06-05";
		Timestamp[] tm =generateCurrentTimestampAndUTCTimestamp(d);
		System.out.println(tm[0]);
		System.out.println(tm[1]);
	}
	
	public static String getHourMinuteSeconds(){
		Calendar calendar = Calendar.getInstance();
		Date date =calendar.getTime();

		 
		 SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss.SSS");

		 String strDate1= formatter1.format(date);
		 return strDate1; 
	}
	
	public static Timestamp[] generateCurrentTimestampAndUTCTimestamp(String targetDate)  {
		 String strDate = targetDate.trim() +" " + getHourMinuteSeconds();
		 SimpleDateFormat UTC_DATA_FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		 UTC_DATA_FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
		 
		 DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		 Date date=null;
		 try {
			date = formatter.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -6);

		

		return new Timestamp[] {
				new Timestamp(calendar.getTimeInMillis()),Timestamp.valueOf(UTC_DATA_FORMATTER.format(calendar.getTime())) };
	}

}
