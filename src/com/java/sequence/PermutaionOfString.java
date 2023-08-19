package com.java.sequence;

public class PermutaionOfString {
	private static void permute(String str, int index) {
		if (index == str.length() - 1) {
			System.out.println(str);
			return;
		}
		for (int i = index; i < str.length(); i++) {
			str = swap(str, i, index);
			permute(str, index + 1);
			str = swap(str, i, index);
		}
	}

	private static String swap(String str, int i, int j) {
		char[] s = str.toCharArray();
		char temp = s[i];
		s[i] = str.charAt(j);
		s[j]= temp;
		return new String(s);
	}

	public static void main(String[] args) {
		String str = "abc";
		permute(str, 0);
	}
}
