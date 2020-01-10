package javaDate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d= LocalDate.now(ZoneId.of("Turkey"));
		System.out.println(d);
//		for(String s: ZoneId.getAvailableZoneIds())
//		{
//			System.out.println(s);
//		}
		
		List<Integer> values=new ArrayList<Integer>();
		for(int i=0;i<=100;i++)
			values.add(i);
		
//		values.forEach(System.out::println);
		values.stream().forEach(System.out::println);

	}

}
