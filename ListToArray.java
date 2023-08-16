package collectionBasic;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(35);
		a.add(55);
		a.add(66);
		Integer[] b = a.toArray(new Integer[a.size()]);
		for (Integer x : b) {
			System.out.println(x);
		}

	}

}
 