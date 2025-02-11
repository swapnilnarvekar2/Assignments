package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> emp1 = new HashMap<String, String>();
		emp1.put("Name", "Alice Johnson");
		emp1.put("Base Salary", "75000");
		emp1.put("Rating", "4.2");
		
		Map<String, String> emp2 = new HashMap<String, String>();
		emp2.put("Name", "Bob Smith");
		emp2.put("Base Salary", "68000");
		emp2.put("Rating", "3.8");
		
		
		List<Map<String, String>> data = new ArrayList<Map<String,String>>();
		data.add(emp1);
		data.add(emp2);
		
		for(int i = 0; i<=data.size(); i++)
		{
			System.out.println(data.get(i).get("Base Salary"));
		}
	}
	
	

}
