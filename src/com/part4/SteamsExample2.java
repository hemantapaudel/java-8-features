package com.part4;

import java.util.Arrays;
import java.util.concurrent.atomic.LongAdder;

public class SteamsExample2 {
	public static void main(String[] args) {

		
		int []arr = {2,4,5,6,9,8,7,4,5,2};
		
		
		LongAdder longAdder = new LongAdder();
		
		Arrays.stream(arr)
		.forEach(element -> longAdder.add(element));
		
		System.out.println(longAdder.longValue());
		
		
		int sum =Arrays.stream(arr).sum();
		System.out.println(sum);
		
	}

}
