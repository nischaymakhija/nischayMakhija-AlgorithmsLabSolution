package com.greatlearning.currency;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");

		int size = sc.nextInt();

		int denominations[] = new int[size];
		System.out.println("Enter the currency denominations value");

		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		CurrencyCalculator cc = new CurrencyCalculator();
		cc.calculate(denominations, amount);
		sc.close();

	}

}
