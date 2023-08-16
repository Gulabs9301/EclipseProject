package com.onesoft.task;

import java.util.Arrays;

public class numberOrder {
	public static void main(String[] args) {
		 //String a = "ABCDEDCBA";
		 //int[] a = { 124, 23, 355, 4512, 562 };
		// String b = "";
//		int a = 8;
//		for (int i = a; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//			}
//			if (i == a) {
//				continue;
//			}
//			System.out.println();
//		}
		// reverse order
//		char[] b=a.toCharArray();
//		for (int i = 0; i<b.length; i++) {
//			for (int j =0;j<=i; j++) {
//				System.out.print(b[j]);
//			}
//			System.out.println();
//		}
//		System.out.println(String.valueOf(a));
//		long temp = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			int itr = 1;
//			int len = String.valueOf(a[i]).length();
//			for (int j = 1; j <= len; j++) {
//				itr = itr * 10;
//
//			}
//			temp = temp * itr + a[i];
//			 System.out.print(a[i]);
//			 
//			 temp=temp*10+a[i];
//		}
//		System.out.println(temp);

		 
//		
//		
		int[] a = { 1, 2, 3, 4, 5, 3, 2, 1 };
		int dupli = -1;
		int min = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (j < min)) {
					dupli = a[j];
					min = j;
				}
			}

		}
		System.out.println("dup=" + dupli + " " + "index=" + min);
	}

}
