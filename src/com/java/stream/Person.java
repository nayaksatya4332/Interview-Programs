package com.java.stream;

public class Person implements Comparable<Person> {
	
	private int age;
	
	public Person(int age) {
		super();
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.age>o.age?1:-1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		Person ps1 = new Person(21);
		Person ps2 = new Person(32);
		System.out.println(ps1.compareTo(ps2));
	}

}
