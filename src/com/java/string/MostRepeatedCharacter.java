package com.java.string;

import java.util.HashMap;
import java.util.Set;

public class MostRepeatedCharacter {
	public static void main(String[] args) {
		String s = "Java is a Programming Language";
		s= s.toLowerCase().replaceAll("\\s", "");
		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char c: s.toCharArray()) {
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		int maxCount= 0;
		char ch = 0;
		Set<Character> chars = charMap.keySet();
		for(char c: chars) {
			if(charMap.get(c)>maxCount) {
				maxCount = charMap.get(c);
				ch = c;
			}
		}
		System.out.println(charMap);
		System.out.println("The Character: "+ch);
		System.out.println("Has MaxCount:"+maxCount);
	}
}
