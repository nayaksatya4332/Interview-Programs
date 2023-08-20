package com.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Main {
	/*
	 * =====Symbols For Formatter====== y or yyyy: Year M or MM: Month d or dd: Day
	 * E or EEE: Day of the week (short or full name) H or HH: Hour in 24-hour
	 * format h or hh: Hour in 12-hour format m or mm: Minute s or ss: Second a:
	 * AM/PM marker ========================
	 */
	public static void main(String[] args) {
		DateToStringToDate converter = new DateToStringToDate();
		
		LocalDate d1 = LocalDate.of(2023, 2, 25);
		LocalDateTime dt1 = LocalDateTime.of(2012, 5, 21, 13, 45);
		
		String ld1 = "12/02/2023";
		String ldt1 = "12-02-2023 12:30:12";
		String ldt2 = "12-02-2023 15:30:12 pm";
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEE dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");

		String date1 = converter.convertLocalDateToString(d1, format1);
		String dateTime1 = converter.convertLocalDateTimeToString(dt1, format3);
		
		LocalDate ldate1 = converter.convertStringToLocalDate(ld1, format2);
		LocalDateTime ldTime1 = converter.convertStringToLocalDateTime(ldt2, format3);
		
		ZoneId zId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zonedDateTime = dt1.atZone(zId);
		System.out.println(zonedDateTime);
//		Main.listAllZones();
	}

	public static void listAllZones() {
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

		// Print all time zone IDs
		for (String zoneId : allZoneIds) {
			System.out.println(zoneId);
		}
	}
}
