package com.onesoft.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ArrayToStream {
	public static void main(String[] args) {
		Integer []a= {2,5,3,8,6,5};
		List<Integer>m=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			m.add(a[i]);
		}
	Optional<Integer> maxi=m.stream().min(Comparator.comparingInt(Integer::valueOf));
	System.out.println(maxi);
	}

}
