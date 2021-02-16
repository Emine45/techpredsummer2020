package day18daytiment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

	public static void main(String[] args) {
		
		//How to get current date
		System.out.println(LocalDate.now());  //2020-06-28
		
		//How to get current time
		System.out.println(LocalTime.now());  //09:46:14.620
		
		//How to get current date and current time together
		System.out.println(LocalDateTime.now());  //2020-06-28T09:48:54.269
		
		//How to update current date to future date
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.plusDays(3));  //2020-07-01
		
		System.out.println(date1.plusMonths(1));  //2020-07-28
		
		System.out.println(date1.plusYears(4));  //2024-06-28
		
		//How to update current date to pass date
		LocalDate date2 = LocalDate.now();
		System.out.println(date2.minusDays(5));  //2020-06-23
		System.out.println(date2.minusMonths(3));  //2020-03-28
		System.out.println(date2.minusYears(1));  //2019-06-28
		
		//How to update current time to future time
		LocalTime time1 = LocalTime.now();
		System.out.println("Current: " + time1);  //Current: 10:06:34.198
		System.out.println("Updated current: " + time1.plusSeconds(20));  //Updated current: 10:06:34.198000020
		System.out.println("Updated current: " + time1.plusMinutes(12));  //Updated current: 10:21:11.141
		System.out.println("Updated current: " + time1.plusHours(2));  //Updated current: 12:07:55.490
		
		//How to update current time to pass time
		LocalTime time2 = LocalTime.now();
		System.out.println("Current: " + time2);  //Current: 10:13:08.935
		System.out.println("Updated current: " + time2.minusSeconds(30));  //Updated current: 10:12:38.935
		System.out.println("Updated current: " + time2.minusMinutes(30));  //Updated current: 09:43:08.935
		System.out.println("Updated current: " + time2.minusHours(30));  //Updated current: 04:13:08.935
	

	}

}
