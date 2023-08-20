package com.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateToStringToDate {
	public String convertLocalDateToString(LocalDate date,DateTimeFormatter formatter) {
		return date.format(formatter);
	}
	public LocalDate convertStringToLocalDate(String dateString,DateTimeFormatter formatter) {
		return LocalDate.parse(dateString,formatter);
	}
	public String convertLocalDateTimeToString(LocalDateTime date,DateTimeFormatter formatter) {
		return date.format(formatter);
	}
	public LocalDateTime convertStringToLocalDateTime(String dateString,DateTimeFormatter formatter) {
		return LocalDateTime.parse(dateString,formatter);
	}
}
