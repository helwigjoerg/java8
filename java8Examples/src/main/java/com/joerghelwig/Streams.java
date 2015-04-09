package com.joerghelwig;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			
			/**
			 * And primitive streams support the additional terminal aggregate operations sum() and average()
			 */
			Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .average()
		    .ifPresent(System.out::println);  
			
			
			Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1)
		    .sorted()
		    .forEach(System.out::println);
			
			/**
			 * Sometimes it's useful to transform a regular object stream 
			 * to a primitive stream or vice versa. 
			 * For that purpose object streams support the special mapping operations mapToInt(), 
			 * mapToLong() and mapToDouble:
			 */
			
			Stream.of("a1", "a2", "a3")
		    .map(s -> s.substring(1))
		    .mapToInt(Integer::parseInt)
		    .max()
		    .ifPresent(System.out::println); 

	}

}
