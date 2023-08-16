package com.onesoft.task;

import java.util.Scanner;

public class FindOccurance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sequence:");
		int a = s.nextInt();
		System.out.println("Enter find number:");
		int b = s.nextInt();
		int c = 0;
		while (a != 0) {
			int x = a % 10;
			if (x == b) {
				c++;
			}
			a = a / 10;

		}
		System.out.println("occurance of " + b + "is " + c);
	}

}
