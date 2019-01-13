package allchapters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

//For loop
public class EdLoop {

	public static void main(String[] args) {	

		/*
		int x=0;
		for (long y=0,x=4;x<5 && y< 10; x++, y++) {
		}
		
		boolean b=false;int x=1;
		String msg = x>1; "Yes";false;
		System.out.println("test" + b );

		for (int x=0;x<10;) {
			System.out.println("before:" +x);
			//x++;
			x=x++;
			//System.out.println("after:" + x++);
		}
		
		int c=7, result=4;
		++c;
		result += c;
		System.out.println("result:" + result);
		
		List<String> list = new ArrayList<>();
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		String[] sArray = list.toArray(new String[0]);
		System.out.println("result:" + sArray);
		LocalTime tm = LocalTime.of(13, 23,15,456);
		LocalDate dt = LocalDate.of(2015, Month.JANUARY, 31);
		LocalDateTime start = LocalDateTime.of(dt,tm);
		dt = LocalDate.of(2015, Month.MARCH, 31);
		LocalDateTime end = LocalDateTime.of(dt,tm);
		animalEnrichment(start,end);
		dt = LocalDate.of(2016, Month.JANUARY, 31);
		start = LocalDateTime.of(dt,tm);
		dt = LocalDate.of(2016, Month.MARCH, 31);
		end = LocalDateTime.of(dt,tm);
		animalEnrichment(start,end);
		String s1 = "j";
		StringBuilder s2 = new StringBuilder("j");
		//if (s1==s2) {};
		if (s1.equals(s2)) {};
		s1+=false;
		boolean az=false;
		System.out.println(s1 + az);
		
		int[] x[] = int [2][3];
		Date[][] dates[] = new Date[2][4][3];
		 */
		
	}

	private static void animalEnrichment(LocalDateTime start, LocalDateTime end) {
		LocalDateTime upTo = start;
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		
		while (upTo.isBefore(end)) {
			System.out.println("give me " + upTo.format(dtf1) + " and this one " + upTo.format(dtf2) + " and this one " + upTo.format(dtf2));
			upTo = upTo.plusMonths(1);
		}
	}
	
}
