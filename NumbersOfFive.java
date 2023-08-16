package com.onesoft.task;

public class NumbersOfFive {
	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 5, 7, 3, 5, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == 5) {
					System.out.println(a[i] + "+" + a[j] + "=5");
				}
			}
		}
	}

}
