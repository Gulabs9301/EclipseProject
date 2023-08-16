package com.onesoft.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		//String a = "onesofttechnolgies";
		String a="Naveen";
		char[] b = a.toLowerCase().toCharArray();
		Set<Character> unique = new HashSet<>();
		List<Character> duplicate = new ArrayList<>();
		for (Character x : b) {
			if (duplicate.contains(x)) {
				continue;
			}
			if (unique.contains(x)) {
				unique.remove(x);
				duplicate.add(x);
			} else {
				unique.add(x);
			}
		}
//		String u = "";
//		String d = "";
//		System.out.println("Duplicates");
//		for (Character x : duplicate) {
//			u = u + Character.toString(x);
//		}
//		System.out.println(u);
//		System.out.println("Unique");
//		for (Character x : unique) {
//			d = d + Character.toString(x);
//		}
//		System.out.println(d);
		System.out.println("unique is :");
		unique.forEach(x->System.out.print(x));
		System.out.println();
		System.out.println("duplicates is and their count:");
//
		int[] c = new int[256];
		for (Character x : b) {
			c[x]++;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] > 1) {
				System.out.println((char) i + "-" + c[i]);
			}
		}
//		Arrays.sort(b);
//		System.out.println(String.valueOf(b));
	}

}
