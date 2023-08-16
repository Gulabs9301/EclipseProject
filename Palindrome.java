package com.onesoft.task;

public class Palindrome {
	public static void main(String[] args) {
		String a = "madam";
		char[] c = a.toCharArray();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + c[i];
		}
		if (a.equals(b)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
