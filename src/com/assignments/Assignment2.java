package com.assignments;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][][] semesterData = {
				
				{
					// Semester 1
					{"Semester1","Mathematics I","78"},
					{"Semester1","Physics","85"},
					{"Semester1","Chemistry","91"},
					{"Semester1","Computer Programming","74"},
					{"Semester1","Engineering Drawing","88"},
					{"Semester1","Basic Electrical Eng.","91"},
				},
				
				{	
					//Semester 2
					{"Semester2","Mathematics II","82"},
					{"Semester2","Mechanics","77"},
					{"Semester2","Environrmental Sci.","93"},
					{"Semester2","Basic Electronics","69"},
					{"Semester2","Engineering Physics","84"},
					{"Semester2","Engineering Graphics","90"},
				},
				
				{
					// Semester 3
					{"Semester3","Data Structures","88"},
					{"Semester3","Discrte Mathematics","81"},
					{"Semester3","Digital Electronics","76"},
					{"Semester3","Operating Systems","92"},
					{"Semester3","Signals and Systems","85"},
					{"Semester3","Object-Oriented Prog.","78"},
				},
				{
					// Semester 4
					{"Semester4","Algorithms","91"},
					{"Semester4","Computer Networks","73"},
					{"Semester4","Database Systems","89"},
					{"Semester4","Microprocessors","80"},
					{"Semester4","Communication Eng.","76"},
					{"Semester4","Software Engineering","87"},
				},
				
				{
					// Semester 5
					{"Semester5","Probability & Stats","86"},
					{"Semester5","Machine Learning","88"},
					{"Semester5","Compiler Design","84"},
					{"Semester5","Theory of Computation","95"},
					{"Semester5","Embedded Systems","73"},
					{"Semester5","Computer Graphics","90"},
					
				}
		};
		
		// Print Semester 3 - Subject 4 and Subject 5 names
		System.out.println(semesterData[2][3][1]+ " AND " + semesterData[2][4][1]);
		
		// Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println(semesterData[4][2][2]+ " AND " + semesterData[4][5][2]);

	}

}
