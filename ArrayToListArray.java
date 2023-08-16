package collectionBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListArray {
	public static void main(String[] args) {

		Integer[] a = { 2, 7, 4, 1, 8, 55, };
		// List<Integer> li = new ArrayList<>();
		// List<Integer> li = new ArrayList<>(Arrays.asList(a));
//		for (int i = 0; i < a.length; i++) {
//			li.add(a[i]);
//		}
		List<Integer> li = Arrays.asList(a);
		System.out.println(li);
	}
}
