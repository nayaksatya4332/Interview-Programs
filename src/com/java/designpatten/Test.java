package com.java.designpatten;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		//Testing Builder Design pattern
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
