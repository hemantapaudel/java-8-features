package com.part5;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		//Creating Optional Objects
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		
	    Optional<String> name  = Optional.of("baeldung");
	    System.out.println(name.get());
	    
//	    Optional<String> opt = Optional.ofNullable(null);
//	    System.out.println(opt.get());
	    
	    // Condition check 
		// using null check
	    String value = "baeldung";
	    if(value != null){
	        System.out.println(value.length());
	    }
	    
	    //using Optional
	    Optional<String> valueOptional  = Optional.of("baeldung");
	    valueOptional.ifPresent(valueOpt -> System.out.println(valueOpt.length()));
	    
	    
	    
	    //Default Value With orElseGet
	    String nullName = null;
	    String orElse = Optional.ofNullable(nullName).orElse("john");
	    System.out.println(orElse);
	    
	    
	    Optional<String> nullableOptional = Optional.ofNullable("hello");
	    System.out.println(nullableOptional.get());
	    
	    
	    //Default Value With orElseGet
	    //Default Value With orElseGet
	    String orElseGet = Optional.ofNullable(nullName).orElseGet(() -> "john");
	    System.out.println(orElseGet);
	    
	  
		
	}

}
