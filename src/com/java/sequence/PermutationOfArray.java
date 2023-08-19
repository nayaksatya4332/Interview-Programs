package com.java.sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArray {
	static List<List<Character>> permute(List<Character> list) {
		List<List<Character>> res = new ArrayList<>();
		solve(list, res, 0);
		return res;
	}

	static void solve(List<Character> list, List<List<Character>> res, int index) {
		if (index == list.size() - 1) {
			List<Character> l = new ArrayList<>();
			l.addAll(list);
			res.add(l);
			return;
		}
		for (int i = index; i < list.size(); i++) {
			swap(list, index, i);
			solve(list, res, index + 1);
			swap(list, index, i);
		}
	}

	private static void swap(List<Character> list, int index, int i) {
		char temp = list.get(index);
		list.set(index, list.get(i));
		list.set(i, temp);
	}

	public static void main(String[] args) {
		List<Character> list = Arrays.asList('a', 'b', 'c');
		List<List<Character>> res = permute(list);
		System.out.println(res);
	}
}
