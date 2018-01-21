package com.part3;

import java.util.stream.IntStream;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Process process  = new Process() {
			@Override
			public void process(int i) {
				System.out.println(i+b);				
			}
		};
		doProcess(a,process);
		
		
		doProcess(a,  i -> System.out.print(i+b));
	   
		
		
		IntStream.range(0, 50)
		.filter(element -> element%2 == 0)
		.forEach(element -> System.out.println(element));
		
		
		
		
	}
	
	
	
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}


