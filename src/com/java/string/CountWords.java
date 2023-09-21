package com.java.string;

public class CountWords {
	public static int countWords(String s) {
		String[] str = s.split(" ");
		System.out.println(String.join("-", str));
		return str.length;
	}

	public static void main(String[] args) {
		System.out.println(countWords("Java is a Programming Language"));
	}
}
