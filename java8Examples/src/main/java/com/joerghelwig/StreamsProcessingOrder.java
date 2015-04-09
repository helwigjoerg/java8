package com.joerghelwig;

import java.util.stream.Stream;

public class StreamsProcessingOrder {

	public static void main(String[] args) {
		
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    });
		
		/**
		 * When executing this code snippet, nothing is printed to the console. 
		 * That is because intermediate operations will only be executed when a terminal operation is present.

Let's extend the above example by the terminal operation forEach:
		 */
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		/**
		 * The order of the result might be surprising. A naive approach would be to execute the operations horizontally 
		 * one after another on all elements of the stream. But instead each element moves along the chain vertically. 
		 * The first string "d2" passes filter then forEach, only then the second string "a2" is processed.
		 */

	}

}
