package com.gargie.code.challenge;

import java.util.Scanner;

public class Day6StringNLoops {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		scn.nextLine();

		for (int i = 0; i < num; i++) {
			String str = scn.nextLine();
			StringBuilder evenStr = new StringBuilder();
			StringBuilder oddStr = new StringBuilder();
			char ch[] = str.toCharArray();

			for (int j = 0; j < ch.length; j++) {
				if (j == 0 || j % 2 == 0)
					evenStr = evenStr.append(ch[j]);
				else
					oddStr = oddStr.append(ch[j]);
			}
			System.out.println(evenStr + " " + oddStr);

		}

		scn.close();

	}
}
