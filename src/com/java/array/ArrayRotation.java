package com.java.array;

import java.util.Arrays;

/*
 * Rotate the Given array d times
 * -------------------------------
 * Write java program to rotate (clockwise) the given array
 * d number of times.
 
    INPUT
	array[] = {1, 2, 3, 4, 5, 6}
	d = 2
	OUTPUT
	{5, 6, 1, 2, 3, 4}
 */
public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int d = 2;
		int n = arr.length;

		if (d > n)
			d = d - n;
		int res[] = new int[n];
		int index = 0;
		for (int i = (n - d); i < res.length; i++, index++) {
			res[index] = arr[i];
		}
		for (int i = 0; i < (n - d); i++, index++) {
			res[index] = arr[i];
		}
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));

		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(res));
	}
}
