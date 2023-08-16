package com.onesoft.task;

import java.util.Scanner;

public class StringModification {
	public static void main(String[] args) {
		// Get inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string:");
		String main = sc.nextLine();
		System.out.println("\nEnter the word to replace:");
		String toReplace = sc.nextLine();
		System.out.println("\nEnter the word to be replaced:");
		String replaceWith = sc.nextLine();

		// set variable values
		String op = "";
		char[] mc = main.toCharArray();
		char[] rc = toReplace.toCharArray();
		int cLen = findLength(mc);
		int rLen = findLength(rc);

		// looping logic
		for (int i = 0; i < cLen; i++) {
			int j = 0;
			if (rc[j] == mc[i]) {
				int k = i;
				boolean isMatch = true;
				while (j < rLen) {
					if (rc[j++] != mc[k++]) {
						isMatch = false;
					}
				}
				if (isMatch) {
					op += replaceWith;
					i = k - 1;
				} else {
					op += mc[i];
				}
			} else {
				op += mc[i];
			}
		}
		System.out.println("\nOutput: \n" + op);
	}

	// method to find length of char array
	public static int findLength(char[] c) {
		int length = 0;
		for (char ch : c) {
			length++;
		}
		return length;
	}

}
