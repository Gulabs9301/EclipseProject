package com.onesoft.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Swap {
	public static void main(String[] args) {
//		int a = 70;
//		int b = 90;
//		a = a + b;
//		b = a-b;
//		a = a-b;
//		System.out.println(a);

		String[] ch = { "t", "e", "e", "s", "s", "s", "h" };
		List<String> li = new ArrayList<>();

		for (int i = 0; i <= ch.length - 1; i++) {
			li.add(ch[i]);
		}
		Map<String, Long> le = li.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		le.forEach((x, y) -> {
			if (y > 1) {
				System.out.print(x + y);
			} else {
				System.out.print(x);
			}
		});

	}

}
