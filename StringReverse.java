package com.onesoft.task;

public class StringReverse {
	  static int i,c=0,res;
	    
	    static void stringreverse(String s)
	    {
	        String[]a=s.split(" ");
	        for(i=a.length-1;i >=0 ;i--) {
	        System.out.print(a[i]+" ");
	        }
	    }
	    
	    public static void main (String args[])
	    {
	        System.out.println("Original String is : ");
	        System.out.println(" manchester united is also known as red devil ");
	        StringReverse.stringreverse(" manchester united is also known as red devil ");
	    }

}
