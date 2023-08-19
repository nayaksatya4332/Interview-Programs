package com.java.string;

import java.util.Arrays;
import java.util.List;

public class CountVowels {
	public static int countVowels(String str) {
		char[] s = str.toLowerCase().toCharArray();
		int count = 0;
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		for (int i = 0; i < s.length; i++) {
			if (vowels.contains(s[i]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Apple";
		System.out.println(countVowels(str));
	}
}
