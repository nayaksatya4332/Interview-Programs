package com.java.string;

public class Palindrome {
	private static boolean checkPalindrome(String str) {
		int length = str.length();
		str = str.toLowerCase();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Level";
		System.out.println(checkPalindrome(str) ? "Palindrome" : "Not Palindrome");
	}
}
