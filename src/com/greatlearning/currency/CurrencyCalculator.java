package com.greatlearning.currency;

public class CurrencyCalculator {

	public void calculate(int arr[], int amount) {
		Sorting sort = new Sorting();
		sort.Sort(arr, 0, arr.length - 1);

		int notes[] = new int[arr.length];
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			notes[i] = amount / arr[i];
			amount = amount % arr[i];
		}

		if (amount % arr[arr.length - 1] != 0) {
			flag = false;
		}

		if (flag == true) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < arr.length; i++) {
				if (notes[i] != 0) {
					System.out.println(arr[i] + ":" + notes[i]);
				}
			}
		} else {
			System.out.println("Exact amount cannot be tendered with the hightest denomination");
		}

	}

}
