package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Challenges with Arrays
		
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		
		// Collections Framework
		
		
		// List ==> ArrayList, LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		
		// Set ==> HashSet, LinkedHashSet, TreeSet
		
		// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
		// 2. Set can follow dynamic memory allocation
		// 3. Set allows modifications
		// 4. Set won't allow duplicate values
		
		// Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		
		// 1. Map can store multiple values with different data types in the form of Key and Value
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map won't allow duplicate keys but it allows duplicate values
		
		System.out.println("******************Collections********************");
		
		//***********************ArrayList**************
		System.out.println("**************ArrayList***************");
		//Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		
		// Order of Storing values:Insertion Order
		// Null Values: Allowed
		// Memory allocation:Contiguous
		List<String> empNamesArraylist = new ArrayList<String>();
		empNamesArraylist.add("Swapnil");
		empNamesArraylist.add("Sagar");
		empNamesArraylist.add("Suraj");
		empNamesArraylist.add(null);
		empNamesArraylist.add("Milli");
		empNamesArraylist.add("Mayur");
		System.out.println("Arraylist Size before removing:"+empNamesArraylist.size());
		empNamesArraylist.remove(4);
		empNamesArraylist.add(1, "Milli");
		System.out.println("Arraylist Size:"+empNamesArraylist.size());
		System.out.println(empNamesArraylist);

		
		//**************************HashMap***********************
		System.out.println("***********************HashMap******************");
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath",1);
		empNamesHashMap.put("Dhilip",2);
		empNamesHashMap.put("Alekya",3);
		empNamesHashMap.put("KK",2);
		empNamesHashMap.put("Vinayak",5);
		empNamesHashMap.put("Balaji",6);
		empNamesHashMap.put("Aarika",7);
		empNamesHashMap.put("Bharath",8);
		empNamesHashMap.put("Swapnil",null);
		empNamesHashMap.put(null,10);
		empNamesHashMap.put(null,11);
		empNamesHashMap.put("Test",null);
		empNamesHashMap.remove("Alekya");
		System.out.println("HashMap Size is : "+empNamesHashMap.size());
		System.out.println(empNamesHashMap);
		
		
		/**********************TreeMap*******************/
		System.out.println("********************TreeMap*************************");
		
		//Syntax to Initialize: Map<Key,Value> variable = new TreeMap<Key,Value>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Ascending Order
		// Null Keys: Not Allowed
		// Null Values: Allowed
		
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath",1);
		empNamesTreeMap.put("Dhilip",2);
		empNamesTreeMap.put("Alekya",3);
		empNamesTreeMap.put("KK",2);
		empNamesTreeMap.put("Vinayak",5);
		empNamesTreeMap.put("Balaji",6);
		empNamesTreeMap.put("Aarika",7);
		empNamesTreeMap.put("Bharath",8);
		empNamesTreeMap.put("Swapnil",null);
		//empNamesTreeMap.put(null,10);
		empNamesTreeMap.remove("Alekya");
		System.out.println("TreeMap Size is : "+empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);
	}

}
