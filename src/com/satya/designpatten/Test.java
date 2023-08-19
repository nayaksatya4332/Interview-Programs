package com.satya.designpatten;

import java.time.LocalDate;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Student std = Student.builder()
				.id(100)
				.age(25)
				.name("Satya")
				.state("Odisha")
				.dob(LocalDate.now().minusYears(25))
				.build();
		System.out.println(std);
	}
}
