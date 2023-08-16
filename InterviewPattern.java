package com.onesoft.task;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewPattern {
	public static void main(String[] args) {
		String[]a={"j", "a", "v", "a"};//, "s", "s", "h"};
		ArrayList<String>ch=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			ch.add(a[i]);
		}
	        String compressedString = ch.stream()
	                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
	                .entrySet()
	                .stream()
	                .map(entry -> entry.getKey() + (entry.getValue() > 1 ? entry.getValue() : ""))
	                .collect(Collectors.joining());

	        System.out.println("Output: " + compressedString);
		
		
//		String a="java";
//		int[]b=new int[256];
//		for(int i=0;i<a.length();i++) {
//			char ch=a.charAt(i);
//			b[ch]++;
//		}
//		for(int i=0;i<a.length();i++) {
//			char x=a.charAt(i);
//			if(b[x]>0) {
//				System.out.println( x+":"+b[x]);
//				b[x]=0;
//				
//			}
//		}
	} 

}
