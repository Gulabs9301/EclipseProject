package com.onesoft.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntSortSecondHighDuplicatesUniques {
	public static void main(String[] args) {
		 //int[] a = { 2, 6, 7, 8, 10, 5, 6, 7, 4, 9, 10 };
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		// descending
//		Integer[] a = { 2, 6, 7, 8, 10, 5, 6, 7, 4, 9, 10 };
//		Arrays.sort(a);
//		Collections.reverse(Arrays.asList(a));
//		for(Integer x:a) {
//			System.out.print(x);
//		}
		// Second high
//		int[] a = { 2, 6, 7, 8, 10, 5, 6, 7, 4, 9, 10 };
//		int high = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		for (Integer x : a) {
//			if (x > high) {
//				second = high;
//				high = x;
//			} else if ((x > second) && (x < high)) {
//				second = x;
//
//			}
//		}
		//System.out.println(second + "is secnd Highest");
		int[] a = { 2, 6, 7, 8, 10, 5, 6, 7, 4, 9, 10 };
		Set<Integer> unique = new HashSet<>();
		List<Integer> duplicate = new ArrayList<>();
		for (Integer x : a) {
			if (!unique.add(x)) {
				duplicate.add(x);
			}
		}
		System.out.println(unique);
		long b = duplicate.stream().count();
		long c = unique.stream().count();
		System.out.println(b + " duplicates and Unique is " + c);

	}

}
