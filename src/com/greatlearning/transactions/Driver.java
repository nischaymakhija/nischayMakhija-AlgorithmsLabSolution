package com.greatlearning.transactions;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		System.out.println("Enter the values of array");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets needs to be achieved");
		int n_target = sc.nextInt();

		Payment pt = new Payment();
		while (n_target > 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			pt.calculate(arr, target);
			n_target--;
		}
		sc.close();
	}

}
