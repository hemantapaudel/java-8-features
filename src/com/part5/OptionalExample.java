package com.part5;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		//Creating Optional Objects
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		
	    Optional<String> name  = Optional.of("baeldung");
	    System.out.println(name.get());
	    
	    Optional<String> opt = Optional.ofNullable(null);
	    System.out.println(opt.get());
	    
		
	    String value = "";
	    if(value != null){
	        System.out.println(value.length());
	    }
	    
	    name.ifPresent( value ->);
	    
	    
	   
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    assertEquals("john", name);
	    
		
	}

}
