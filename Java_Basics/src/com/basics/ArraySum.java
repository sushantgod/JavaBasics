package com.basics;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int num : arr) {
			sum += num;

		}
		System.out.println("Sum of array: " + sum);

	}

}
