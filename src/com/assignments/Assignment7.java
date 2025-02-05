package com.assignments;

import java.util.LinkedList;
import java.util.List;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> transaction = new LinkedList<Integer>();
		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);
		
		int debitTransaction = 0;
		int creditTransaction = 0;
		int debitAmount = 0;
		int creditAmount = 0;
		int suspiciousTransaction = 0;
		for(int i= 0; i < transaction.size();i++ ) {
			
			if(transaction.get(i)>0) {
				
				creditTransaction = creditTransaction + 1;
				creditAmount = creditAmount + transaction.get(i);
			}
			
			if(transaction.get(i)<0) {
				
				debitTransaction = debitTransaction+1;
				debitAmount = debitAmount + transaction.get(i);
			}
			
			if (transaction.get(i) > 10000 || transaction.get(i) < -10000) {
				
				suspiciousTransaction = suspiciousTransaction + 1;
				System.out.println("“Suspicious credit/ debit Transaction " + transaction.get(i));
				
			}
			
		}
		
		// 1. No. of credit transaction
		System.out.println("No. of credit transaction: " + creditTransaction);

		// 1. No. of debit transaction
		System.out.println("No. of credit transaction: " + debitTransaction);

		// 2. Total amount credited
		System.out.println("Total amount credited: " + creditAmount);
		
		// 2. Total amount debited
		System.out.println("Total amount debited: " + debitAmount);
		
		// 3. Print total amount remaining at the end in bank account
		System.out.println("Bank balance amount: " + (creditAmount-(-debitAmount)));
		
		// 4. Any transaction limit exceeds +/- 10000 then 
		System.out.println("Total Suspicious Transactions: " + suspiciousTransaction);
		
	}

}
