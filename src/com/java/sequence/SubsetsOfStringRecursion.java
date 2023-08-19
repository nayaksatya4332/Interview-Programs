package com.java.sequence;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfStringRecursion {
	public static void main(String[] args) {
		String str = "abc";
		powerSet(str);
	}

	private static void powerSet(String str) {
		char[] set = str.toCharArray();
		List<Character> res = new ArrayList<>();
		solve(set, res, 0);
	}

	private static void solve(char[] set, List<Character> res, int n) {
		if (n == set.length) {
			System.out.println(res);
			return;
		}
		res.add(set[n]);
		solve(set, res, n + 1);
		res.remove(res.size() - 1);
		solve(set, res, n + 1);
	}
}
