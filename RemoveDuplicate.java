package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
//		String a="This is nisha and This is my laptop";
//		String[]b=a.split(" ");
//		Set<String> unique = new HashSet<>();
//		List<String> duplicate = new ArrayList<>();
//		for (String x : b) {
//			if (duplicate.contains(x)) {
//				continue;
//			}
//			if (unique.contains(x)) {
//				unique.remove(x);
//				duplicate.add(x);
//			} else {
//				unique.add(x);
//			}
//		}
//		System.out.println(unique);
		String sf = "this is nisha and this is my laptop";

		String[] sp = sf.split(" ");

		String sh = "";
		for (int i = 0; i < sp.length; i++) {

			for (int j = i + 1; j < sp.length; j++) {
				if (sp[i].equals(sp[j])) {
					sp[i] = "";
					sp[j] = "";
				}

			}
			if (sp[i] != "") {
				sh = sh  + sp[i]+ " ";
			}

		}
		System.out.println(sh);
	}
	
}
