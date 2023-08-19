package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Find All duplicate elements
 * ---------------------------
 * Write java program to find all the duplicates
 * elements from the given array.
  
    INPUT
	{2, 1, 2, 2, 1, 3}
	OUTPUT
	All duplicates are :: [1, 2]
  
 */
public class FindDuplicate {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 9, 2, 1, 3, 4, 8 };
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i != j && !list.contains(arr[i]) && j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					list.add(arr[i]);
					break;
				}
			}
		}
		System.out.println("Duplicate Elements are: ");
		System.out.println(list.toString());
	}
}
