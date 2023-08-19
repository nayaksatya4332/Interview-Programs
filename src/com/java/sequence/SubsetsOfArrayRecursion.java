package com.java.sequence;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArrayRecursion {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c' };
		List<Character> res = new ArrayList<>();
		int n = arr.length;
		findSubsets(arr, res, n);
	}

//	Approach 01
//	static void findSubsets(char[] arr, List<Character> res, int i) {
//		if (i == arr.length - 1) {
//			System.out.println(res);
//			return;
//		}
//		res.add(arr[i]);
//		findSubsets(arr, res, i+1);
//		res.remove(res.size()-1);
//		findSubsets(arr, res, i+1);
//	}
//	Approach  02
	static void findSubsets(char[] arr, List<Character> res, int n) {
		if (n == 0) {
			System.out.println(res);
			return;
		}
		res.add(arr[n - 1]);
		findSubsets(arr, res, n - 1);
		res.remove(res.size() - 1);
		findSubsets(arr, res, n - 1);
	}
}
