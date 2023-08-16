package com.onesoft.task;

public class NumberToAlpha {
	   public static  String[] WORDS = {
	            "zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };
	   public static String[] TENS = {
	            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String convertToWord(int number) {
	        if (number < 20) {
	            return WORDS[number];
	        } else if( number % 10==0) {
	            int tensDigit = number / 10;
	            return TENS[tensDigit]  ;
	        }else {
	        	int tensDigit = number / 10;
	        	int onesDigit=number%10;
	            return TENS[tensDigit] +  " " + WORDS[onesDigit] ;
	        	
	        }
	    }

	    public static void main(String[] args) {
	        int inputNumber =78;
	        String wordRepresentation = convertToWord(inputNumber);
	        System.out.println("Number " + inputNumber + " as word: " + wordRepresentation);
	    }
	


}
