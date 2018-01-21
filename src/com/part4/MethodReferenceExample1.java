package com.part4;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		
		Thread thread1 = new Thread(()->System.out.println("Hello"+ Thread.currentThread().getName()));
			
		
		Thread thread4 = new Thread(()->printMessage());
		Thread thread5 = new Thread(MethodReferenceExample1::printMessage);
		
		
		thread1.start();
		thread4.start();
		thread5.start();
		
	}
	
	
	
	
	
	public static void printMessage() {
		System.out.println("Hello"+ Thread.currentThread().getName());
	}
	

}
