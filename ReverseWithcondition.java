package com.onesoft.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWithcondition {
	public static void main(String[] args) {
		String a ="abc123def";
//		String b="fed32cba";
		char[]b=a.toCharArray();
		String output="";
		for(int i=b.length-1;i>=0;i--) {
			if(b[i]-'0'==1) {
				continue;
			}else {
				output+=b[i];
			}
		}
		System.out.println(output);
		
//		
//		List<String> ch=Arrays.asList("a","b","c","d","e","f","g","h");
//		for(String x:ch) {
//			if(x)
//		}
		
		

	}

}
