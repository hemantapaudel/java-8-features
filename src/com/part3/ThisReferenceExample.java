package com.part3;

import java.util.function.Consumer;



public class ThisReferenceExample {
	
	public void doProcess(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
	
	public void process(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {	
		return "ThisReferenceExample class this ";
	}
	
	public void execute() {	
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this); 
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		Consumer<Integer>  anonymousConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println("Value of i is " + i);
				System.out.println(this); 
			}
			@Override
			public String toString() {
				return "Annoymous class this ";
			}
		};
		thisReferenceExample.doProcess(20,anonymousConsumer);
		
		thisReferenceExample.process();
		
		
		
		
		/*Consumer<Integer>  lambdaConsumer = i->{
			System.out.println("Value of i is " + i);
		};
		thisReferenceExample.doProcess(10, lambdaConsumer);
	
		
		
		thisReferenceExample.execute();*/
	}

}
