package com.joerghelwig;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectExample {
	
	
	 public static void main(String [] args) {
		 
		 List<Person> persons =
				    Arrays.asList(
				        new Person("Max", 18),
				        new Person("Peter", 23),
				        new Person("Pamela", 23),
				        new Person("David", 12));
		 
		 
		 List<Person> filtered =
				    persons
				        .stream()
				        .filter(p -> p.getName().startsWith("P"))
				        .collect(Collectors.toList());
		 
		 
		 /**Collect is an extremely useful terminal operation to transform the elements of the stream into a different kind of result, e.g. a List, Set or Map.*/

				System.out.println(filtered);    // [Peter, Pamela]
				
				System.out.println("The next example groups all persons by age:");
				
				
				Map<Integer, List<Person>> personsByAge =  (Map) persons
					    .stream()
					    .collect(Collectors.groupingBy(p -> p.getAge()));

					personsByAge
					    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

					// age 18: [Max]
					// age 23: [Peter, Pamela]
					// age 12: [David]
					
					System.out.println("The next example joins all persons into a single string:");
					
					String phrase = persons
						    .stream()
						    .filter(p -> p.getAge() >= 18)
						    .map(p -> p.getName())
						    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

						System.out.println(phrase);
						// In Germany Max and Peter and Pamela are of legal age.

	    
	    }
	 
	
	
	


}
