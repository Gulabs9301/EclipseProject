package com.onesoft.task;

public class SqByNumber {
	public static void main(String[] args) {
		String a = "a1b2c3d4e5";
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i=i+2) {
			int c=b[i+1]-'0';
			for(int j=1;j<=c;j++) {
				System.out.print(b[i]);
			}
			if(i==b.length-2) {
				continue;
			}else {
				System.out.print(",");
			}
			
		}

		

	}

}
