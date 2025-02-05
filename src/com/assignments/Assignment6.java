package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String customerName = "John Doe";
		int creditScore = 652;
		float income = 55000.0f;
		boolean isEmployed = false;
		float debtToIncomeRatio = 40.0f;
		
		if(creditScore>750){
			
			System.out.println("The loan is approved");
			
		}
		else {
			if(creditScore>=650 && creditScore<=750) {
				
				if(income>=50000) {
					
					if(isEmployed) {
						
						if(debtToIncomeRatio<=40) {
							
							System.out.println("The loan is approved by checking mmultiple elegibilities");
						}
						else {
							
							System.out.println("The loan is denied as debtToIncomeRatio is greater than 40");
						}		
					}
					else {
						System.out.println("No loan due to unemployment");
					}
				}
			}
			else {
				System.out.println("The loan is denied as credit score is less than 650");
			}
		}

	}

}
