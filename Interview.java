package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {
	public static void main(String[] args) {

//		firts method using Arrays inbuilt
//		String []a= {"java","is","a","good","programming","language"};
//			//Arrays.sort(a, (s1,s2)->Integer.compare(s1.length(), s2.length()));
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}

		// second method using loop
		String []a= {"java","is","a","good","programming","language"};
		String temp="";
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j].length()<a[i].length()) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		// using streams
		// Integer[] a = { 4, 5, 2, 8, 6, 1 };
//		String a = "java is a good programming language";
//		String[]b=a.split(" ");
//		List<String> input = Arrays.asList(b);
//		 input.stream().sorted(Comparator.comparingInt(String::length)).forEach(z->System.out.print(z+" "));
//		input.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//				.forEach((x, y) -> System.out.print(x + y));


//		String ax = "naveen";
//		 List<Character> ab = ax.chars().mapToObj(c -> (char)
//		 c).collect(Collectors.toList());
//		ab.stream().filter(x -> !(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'))
//				.collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//				.forEach((x, y) -> System.out.println(x + "-" + y));

//		String a = "naveen";
//        List<Character> charList = Arrays.asList('a', 'e', 'i', 'o', 'u');
//
//        // Convert the string to a character list
//        List<Character> charArray = a.chars()
//                                    .mapToObj(c -> (char) c)
//                                    .collect(Collectors.toList());
//
//        // Filter, group, and count vowels
//        charArray.stream()
//                 .filter(x -> !charList.contains(x))
//                 .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                 .forEach((x, y) -> System.out.println(x + "-" + y));
//		

	}

}