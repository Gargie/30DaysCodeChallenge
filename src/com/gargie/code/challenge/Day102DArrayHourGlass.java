package com.gargie.code.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Day102DArrayHourGlass {

	private static final Scanner scanner = new Scanner(System.in);

	public static void sumHourGlass(int arr[][]) {
		int sumArrSize = (arr.length - 2) * (arr.length - 2);
		int sum[] = new int[sumArrSize];
		int h = 0;

		for (int m = 0; m < (arr.length - 2); m++) {
			for (int n = 0; n < (arr.length - 2); n++) {
				sum[h] = arr[m][n] + arr[m][n + 1] + arr[m][n + 2] + arr[m + 1][n + 1] + arr[m + 2][n]
						+ arr[m + 2][n + 1] + arr[m + 2][n + 2];
				h++;
			}
		}
		Arrays.sort(sum);

		System.out.println(sum[sum.length - 1]);
	}

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		sumHourGlass(arr);

		scanner.close();
	}
}
