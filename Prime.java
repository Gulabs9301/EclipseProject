package com.onesoft.task;

public class Prime {
	public static void main(String[] args) {
		//int[] a = {5, 390, 421, 554, 623, 778 };
		int n=100;
		for (int i = 0; i < n; i++) {
			int b=1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b=0;
					break;
					
				}	
			}
			if(b==1) {
				System.out.println(i+"-----prime");
			} else {
				//System.out.println(i+"------Not Prime");
				continue;
			}
			
		}
	}
}
