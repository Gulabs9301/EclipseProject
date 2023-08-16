package com.onesoft.task;

public class StringToNumber {
	public static void main(String[] args) {
		String a = "3,5,8,4,9,2";
		String[] b = a.split(",");
		String c = "";
		for (int i = 0; i < b.length; i++) {
			c = c + b[i];
		}
		System.out.println(Integer.parseInt(c));

	}

}
