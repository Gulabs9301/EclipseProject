package com.onesoft.task;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 145;
		String b = String.valueOf(a);
		char[] c = b.toCharArray();

		int temp2 = 0;
		for (int i = 0; i < c.length; i++) {
			int temp = 1;
			for (int j = 0; j < c.length; j++) {
				temp = temp * (c[i] - '0');
			}
			temp2 = temp2 + temp;
			// System.out.println(temp);
		}
		if (temp2 == a) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}

		// Second method

//		 int a = 153;
//			String b = String.valueOf(a);
//			char[] c = b.toCharArray();
//			
//			int temp2 = 0;
//			List<Integer>li=new ArrayList<>();
//			while (a!=0) {
//				li.add(a%10);
//				a=a/10;
//			}
//			for(int i=0;i<li.size();i++) {
//	 			int temp = 1;
//				for(int j=0;j<li.size();j++) {
//					temp=temp*li.get(i);
//				}
//				temp2=temp2+temp;
//			}
//			System.out.println(temp2);

	}

}
