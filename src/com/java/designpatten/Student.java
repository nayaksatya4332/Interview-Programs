package com.java.designpatten;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private int age;
	private String state;
	private LocalDate dob;

	static class StudentBuilder {
		private int _id;
		private String _name;
		private int _age;
		private String _state;
		private LocalDate _dob;

		StudentBuilder id(int id) {
			this._id = id;
			return this;
		}

		StudentBuilder name(String name) {
			this._name = name;
			return this;
		}

		StudentBuilder age(int age) {
			this._age = age;
			return this;
		}

		StudentBuilder state(String state) {
			this._state = state;
			return this;
		}

		StudentBuilder dob(LocalDate dob) {
			this._dob = dob;
			return this;
		}

		Student build() {
			return new Student(_id, _name, _age, _state, _dob);
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", state=" + state + ", dob=" + dob + "]";
	}

	public static StudentBuilder builder() {
		return new StudentBuilder();
	}

}
