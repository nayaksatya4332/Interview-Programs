package com.java.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 90, 10, 50, 20, 70, 60 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		int limit = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < limit - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false)
				break;
			else
				flag = false;
		}
	}
}
