package com.onesoft.task;

//factorial using without loop
public class Recursion {
	public static int sum(int start, int end) {
		if (end > start) {
			return end * sum(start, end - 1);
		} else {
			return end;
		}
	}

	public static void main(String[] args) {
		int result = sum(1, 9);
		System.out.println(result);
	}

}
