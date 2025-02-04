package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Create a list of top 5 most populated countries in the world and print 2nd country
		// Storing list of countries in ArrayList
		List<String> countries = new ArrayList<String>();
		countries.add("United States");
		countries.add("China");
		countries.add("Russia");
		countries.add("United Kingdom");
		countries.add("Germany");
		
		//printing 2nd most populated country
		System.out.printf("2nd most populated country in the world is: %s ",countries.get(1));
		System.out.println();
		
		//2. Create a set of top 10 most visited tourist attractions in the world and print out its size
		Set<String> touristAttractions = new HashSet<String>();
		touristAttractions.add("Eiffel Tower");
		touristAttractions.add("Great Wall of China");
		touristAttractions.add("New York");
		touristAttractions.add("Colosseum ");
		touristAttractions.add("London");
		touristAttractions.add("Dubai");
		touristAttractions.add("Paris");
		touristAttractions.add("Taj Mahal");
		touristAttractions.add("Angkor Wat");
		touristAttractions.add("Singapore");
		System.out.println("Size of Set is: " + touristAttractions.size());
		
		//3. Create a map of 5 largest cities in the United States with population
		Map<String, Integer> cities = new HashMap<String, Integer>();
		cities.put("New York", 8258035);
		cities.put("Los Angeles", 3820914);
		cities.put("Chicago", 2664452);
		cities.put("Houston", 2314157);
		cities.put("Phoenix", 1650070);
		System.out.println(cities);
		
		//4. Create an Array of 10 random integers and print out the sum of 3rd and 5th value
		int[] numbers = new int[10];
		numbers[0] = 20;
		numbers[1] = 10;
		numbers[2] = 25;
		numbers[3] = 11;
		numbers[4] = 10;
		numbers[5] = 55;
		numbers[6] = 50;
		numbers[7] = 35;
		numbers[8] = 12;
		numbers[9] = 6;
		System.out.println("Sum of 3rd and 5th value is: " + (numbers[2]+numbers[4]));
		
		//5. Create a list of top 5 highest-growning movies all the time and print the 3rd movie from the list
		List<String> movies = new ArrayList<String>();
		movies.add("Pushpa");
		movies.add("DDLJ");
		movies.add("Natrang");
		movies.add("KGF");
		movies.add("Drishyam");
		System.out.println("3rd movie is: " + movies.get(2));
		
		
	}

}
