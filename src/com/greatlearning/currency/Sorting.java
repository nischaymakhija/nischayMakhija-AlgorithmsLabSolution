package com.greatlearning.currency;

public class Sorting {
	public void Sort(int arr[], int start, int end) {
		if (start < end) {
			int part = partition(arr, start, end);
			Sort(arr, start, part - 1);
			Sort(arr, part + 1, end);
		}
	}

	int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int pivot_index = start;

		for (int j = start; j <= end - 1; j++) {
			if (arr[j] >= pivot) {
				int temp = arr[pivot_index];
				arr[pivot_index] = arr[j];
				arr[j] = temp;
				pivot_index++;
			}
		}

		int temp = arr[pivot_index];
		arr[pivot_index] = arr[end];
		arr[end] = temp;
		return pivot_index;
	}

}
