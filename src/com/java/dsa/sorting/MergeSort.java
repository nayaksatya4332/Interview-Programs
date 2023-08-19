package com.java.dsa.sorting;

import java.util.Arrays;

public class MergeSort {
	public void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int middle = arr.length / 2;
		int[] left = new int[middle];
		for (int i = 0; i < middle; i++) {
			left[i] = arr[i];
		}
		int[] right = new int[arr.length - middle];
		for (int i = middle; i < arr.length; i++) {
			right[i - middle] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);

		merge(left, right, arr);
	}

	public void merge(int[] left, int[] right, int[] arr) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = {89,23,10,55,34,90};
		MergeSort sort = new MergeSort();
		sort.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
