package com.greatlearning.transactions;

public class Payment {

	public void calculate(int[] arr, int target) {
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (sum >= target) {
				System.out.println("Target archieved after " + (i + 1) + " transactions");
				break;
			}
		}

		if (i == arr.length && target > sum) {
			System.out.println("Given target is not achieved");
		}
	}

}
