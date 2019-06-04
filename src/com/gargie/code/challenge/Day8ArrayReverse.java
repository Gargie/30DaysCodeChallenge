package com.gargie.code.challenge;

import java.util.Scanner;

public class Day8ArrayReverse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int temp;
		for (int y = 0; y < arr.length / 2; y++) {
			temp = arr[y];

			arr[y] = arr[(arr.length - 1) - y];

			arr[(arr.length - 1) - y] = temp;

		}

		for (int x = 0; x < n; x++)
			System.out.print(arr[x] + " ");

		scanner.close();
	}
}
