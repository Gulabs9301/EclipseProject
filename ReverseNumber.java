package com.onesoft.task;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to reverse:");
		Scanner s = new Scanner(System.in);
//		int a, b = 0, c = s.nextInt();
//		while (c!=0) {
//			a = c % 10;
//			b = (b * 10) + a;
//			c = c / 10;
//		}
//		System.out.println(b);
		int a=s.nextInt();
		int b=0;
		while(a!=0) {
			a=a/10;
			b++;
		}
		System.out.println(b);
	}

}
