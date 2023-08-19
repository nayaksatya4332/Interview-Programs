package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
	private String name;

	public Student(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
public class Test {
	public static void main(String[] args) {
		Student std1 = new Student("Satya");
		List<Student> list = new ArrayList<>();
		list.add(std1);
		list.add(new Student("Rahul"));
		
		list.remove(std1);
		System.out.println(list);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String:");
//		String str = sc.nextLine();
//		String longest = "";
//		char[] s = str.toCharArray();
//		for(int i=0;i<s.length;i++) {
//			List<Character> temp = new ArrayList<>();
//			for(int j=i;j<s.length;j++) {
//				if(!temp.contains(s[j])) {
//					temp.add(s[j]);
//				}else {
//					break;
//				}
//			}
//			if(temp.size()>longest.length()) {
//				longest = "";
//				for(char c:temp) {
//					longest+=c;
//				}
//			}
//		}
//		System.out.println(longest+" "+longest.length());
	}
}
