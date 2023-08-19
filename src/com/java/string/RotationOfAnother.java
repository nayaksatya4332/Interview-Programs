package com.java.string;

public class RotationOfAnother {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dabc";
		int res = checkRotation(str1,str2);
		String s = (res>=0) ?
				"Rotation Degree:"+res:"Not a Rotation";
		System.out.println(s);
	}

	private static int checkRotation(String str1, String str2) {
		str1 = str1.trim();
		str2 = str2.trim();

		if (str1 == null || str2 == null)
			return -1;
		if (str1.length() != str2.length())
			return -1;
		String str = str1 + str1;
		if (str.contains(str2)) {
			return str1.length() - str.indexOf(str2);
		}
		return -1;
	}
}
