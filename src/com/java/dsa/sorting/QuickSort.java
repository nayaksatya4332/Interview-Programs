package com.java.dsa.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 90, 10, 50, 20, 70, 60 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int start, int end) {
		if(start >= end) {
//			System.out.println(start+" "+end);
			return;
		}
		int pivot = partition(arr, start, end);
		sort(arr,start,pivot-1);
		sort(arr,pivot+1,end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start-1;
		for (int j = start; j <= end; j++) {
			if (arr[j] <= pivot) {
				swap(arr, ++i, j);
			}
		}
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
