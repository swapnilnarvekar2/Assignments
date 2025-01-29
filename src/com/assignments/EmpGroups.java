package com.assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating instance of Employees class
		Employees emp = new Employees();
		
		// Creating string array to store employee names
		String[] empNames = {emp.empName1, emp.empName2, emp.empName3};
		
		// Creating integer array to store employee id's`
		int[] empIds = {emp.empID1, emp.empID2, emp.empID3};
		
		// Printing employee name with id's
		System.out.println("Employee Name:" + empNames[0] + ", Employee ID:" + empIds[0]);
		System.out.println("Employee Name:" + empNames[1] + ", Employee ID:" + empIds[1]);
		System.out.println("Employee Name:" + empNames[2] + ", Employee ID:" + empIds[2]);
	}

}
