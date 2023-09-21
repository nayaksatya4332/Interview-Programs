package com.java.stream;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;
	private List<Project> projectList;

	public Student(int id, String name, int age) {
		this(id,  name,  age,  null);
	}

	public Student(int id, String name, int age, List<Project> projectList) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.projectList = projectList;
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

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", projectList=" + projectList + "]";
	}

}
