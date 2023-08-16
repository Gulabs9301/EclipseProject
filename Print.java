package com.onesoft.task;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = s.nextInt();
		System.out.println("output:");
		// int a=1234;
		String b = String.valueOf(a);
		char[] c = b.toCharArray();
		for (int i = 0; i < b.length(); i++) {
//			if (i == b.length() - 1) {
//				System.out.print(c[i]);
//			} else {
//				System.out.print(c[i] + ",");
//			}
			System.out.println(c[i]);
		}

	}

}
