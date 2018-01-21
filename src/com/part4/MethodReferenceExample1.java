package com.part4;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		
		Thread thread1 = new Thread(()->System.out.println("Hello"+ Thread.currentThread().getName()));
		Thread thread2= new Thread(()->System.out.println("Hello"+ Thread.currentThread().getName()));
		Thread thread3 = new Thread(()->System.out.println("Hello"+ Thread.currentThread().getName()));
			
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
	
	
	
	
	public static void printMessage() {
		System.out.println("Hello"+ Thread.currentThread().getName());
	}
	

}
