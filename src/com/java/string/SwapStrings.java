package com.java.string;

public class SwapStrings {
	public static void main(String[] args) {
		// Without Third Variable..
		String s1 = "Satya";
		String s2 = "Sarathi";
		s1 = s1 + s2;
		s2 = s1.substring(0,s1.length()- s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1+"\n"+s2);
	}
}
