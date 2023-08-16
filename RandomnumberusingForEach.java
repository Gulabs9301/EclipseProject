package com.onesoft.task;

import java.util.Random;

public class RandomnumberusingForEach {
	public static void main(String[] args) {
		Random r=new Random();
		r.ints().limit(5).forEach(System.out::println);
	}

}
