package com;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Times {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		LocalDateTime datetime=LocalDateTime.now();
		Instant instant=Instant.now();
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		System.out.println(instant);
		
		//custom format
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String newDateTime=dateTime.format(formatter);
		System.out.println(newDateTime);
		
		
	}

}
