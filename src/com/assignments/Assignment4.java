package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Storing 1st employee data in map
		Map<String, String> employee1 = new HashMap<String, String>();
		employee1.put("Employee ID", "E001");
		employee1.put("Name", "Alice Green");
		employee1.put("Age", "30");
		employee1.put("Gender", "Female");
		employee1.put("Department", "Engineering");
		employee1.put("Position", "Software Engineer");
		employee1.put("Salary", "75000");
		employee1.put("Email", "alice@example.com");
		employee1.put("Contact Number", "9876543213");
		
		// Storing 2nd employee data in map
		Map<String, String> employee2 = new HashMap<String, String>();
		employee2.put("Employee ID", "E002");
		employee2.put("Name", "Bob Johnson");
		employee2.put("Age", "35");
		employee2.put("Gender", "Male");
		employee2.put("Department", "Marketing");
		employee2.put("Position", "Marketing Manager");
		employee2.put("Salary", "85000");
		employee2.put("Email", "bob@example.com");
		employee2.put("Contact Number", "9876543214");
		
		// Storing 3rd employee data in map
		Map<String, String> employee3 = new HashMap<String, String>();
		employee3.put("Employee ID", "E003");
		employee3.put("Name", "Carol White");
		employee3.put("Age", "28");
		employee3.put("Gender", "Female");
		employee3.put("Department", "Sales");
		employee3.put("Position", "Sales Executive");
		employee3.put("Salary", "65000");
		employee3.put("Email", "carol@example.com");
		employee3.put("Contact Number", "9876543215");
		
		
		// Storing all the employee data maps in list
		List<Map<String,String>> employeeData = new ArrayList<Map<String,String>>();
		employeeData.add(employee1);
		employeeData.add(employee2);
		employeeData.add(employee3);
		
		// Accessing the email address of 2nd employee and printing from list
		System.out.println(employeeData.get(1).get("Email"));
	}

}
