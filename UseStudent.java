package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "Naveen", 'a', 29);
		Student s2 = new Student(1001, "Naveen", 'a', 29);
		Student s3 = new Student(1003, "Sugu", 'a', 21);
		Student s4 = new Student(1004, "Kathir", 'b', 23);
		Student s5 = new Student(1005, "Goindhan", 'c', 22);
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		// tO GET SORTED
//		List<String> names = students.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
		// TO GET SORTED IN DESCENDING
		// List<String> names = students.stream().map(x ->
		// x.getName()).sorted(Comparator.reverseOrder())
		// .collect(Collectors.toList());
		// to get unique values
		 List<Character> Section = students.stream().map(x ->
		 x.getSec()).distinct().skip(1).limit(2)
		 .collect(Collectors.toList());
		 System.out.println(Section);
		// to find max in listOf Objects
		// Student a =
		// students.stream().max(Comparator.comparing(Student::getAge)).get();
		// Student b =
		// students.stream().min(Comparator.comparing(Student::getAge)).get();
		// only int of field
		// int b = students.stream().map(x ->
		// x.getAge()).max(Comparable::compareTo).get();
		// Second max
		// int b = students.stream().map(x ->
		// x.getAge()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		// summing int
//		 int b = students.stream().collect(Collectors.summingInt(Student::getAge));
//		 System.out.println(b);
		// groupingBy
//		Map<Integer, List<Student>> b = students.stream().sorted(Comparator.comparing(Student::getAge))
//		 .collect(Collectors.groupingBy(Student::getAge));
//		b.forEach((x, y) -> {
//			System.out.println(x + " " + y);
//
//		});

		// flatMap
//		List<Integer> age = students.stream().map(x -> x.getAge()).collect(Collectors.toList());
//		List<Integer> rollNo = students.stream().map(x -> x.getRollNo()).collect(Collectors.toList());
//		List<List<Integer>> results = Arrays.asList(age, rollNo);
//		List<Integer> result = results.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
//		result.forEach(x -> System.out.println(x));	
		// to MAP
//		Map<Integer, String> b = students.stream().collect(Collectors.toMap(Student::getAge, Student::getName));
//		b.forEach((x, y) -> {
//			System.out.println(x + " " + y);
//		});
		// to Set
//		ArrayList<Student> b = (ArrayList<Student>) students.stream().collect(Collectors.toList());
//		b.forEach((x) -> {
//			System.out.println(x);
//		});
		//Sorting with condition
//		List<Student> btsal=students.stream().filter(x->x.getAge()<30).sorted(Comparator.comparing(Student::getAge).reversed())
//		 .sorted(Comparator.comparing(Student::getRollNo).reversed()).collect(Collectors.toList());
//		btsal.forEach(x->System.out.println(x));
		
//		List<Integer>a=Arrays.asList(3,5,2,7,8,9);
//		List<Integer>b=a.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
//		System.out.println(b);
//		
//		one string conversion
//		String a="naveen";
//		char[]Input = a.toCharArray();
//		List<char[]>b=Arrays.asList(Input);
//		Map<Object, Long>output=b.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
//		.entrySet()
//         .stream()
//         .map(entry -> entry.getKey() + (entry.getValue() > 1 ? entry.getValue():""))
//       for(Object x:output.keySet()) {
//    	   System.out.println(output.get(x));
//       }
		
//		
//		int  total=students.stream().collect(Collectors.summingInt(Student::getAge));
//		System.out.println(total);
//		int total=students.stream().map(x->x.getAge()).reduce(0, (a,b)->a+b);
//		System.out.println(total);
//		 List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
//		 String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(","));
//		 System.out.println(G7Countries);
		 Map<Object,Long>hi=students.stream().collect(Collectors.groupingBy(x->x.getSec(),Collectors.counting()));
		 System.out.println(hi);
		
	 		
	}

}
