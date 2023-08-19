package com.java.string;

import java.util.Arrays;

public class Anagram {
	public static boolean checkAnagram(String s1, String s2) {
		s1 = s1.toLowerCase().replaceAll("\\s", "");
		s2 = s2.toLowerCase().replaceAll("\\s", "");

		char[] arr01 = s1.toCharArray();
		char[] arr02 = s2.toCharArray();

		Arrays.sort(arr01);
		Arrays.sort(arr02);

		return Arrays.equals(arr01, arr02);
	}

	public static void main(String[] args) {
		if(checkAnagram("Seek","kees")) {
			System.out.println("Anagram..");
		}else{
			System.out.println("Not Anagram..");
		}
	}
}
