package com.java.designpatten;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private int age;
	private String state;
	private LocalDate dob;

	static class StudentBuilder {
		private int id;
		private String name;
		private int age;
		private String state;
		private LocalDate dob;

		StudentBuilder id(int id) {
			this.id = id;
			return this;
		}

		StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		StudentBuilder state(String state) {
			this.state = state;
			return this;
		}

		StudentBuilder dob(LocalDate dob) {
			this.dob = dob;
			return this;
		}

		Student build() {
			return new Student(id, name, age, state, dob);
		}

	}

	public Student() {
		super();
	}

	public Student(int id, String name, int age, String state, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", state=" + state + ", dob=" + dob + "]";
	}

	public static StudentBuilder builder() {
		return new StudentBuilder();
	}

}
