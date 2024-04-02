package com.jery.PaymentDetails;

import java.util.Scanner;

public class PaymentMain {

	public void payment() {
		CreditandDebitCard obj1 = new CreditandDebitCard();
		System.out.println("SELECT THE PAYMENT OPTION GIVEN BELOW");
		System.out.println("ENTER 1 FOR CREDIT OR DEBIT CARD");
		System.out.println("ENTER 2 FOR NETBANKING");
		System.out.println("ENTER 3 FOR UPI");
		System.out.println("ENTER 4 FOR EMI");
		System.out.println("ENTER 5 FOR CASH ON DELIVERY");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		if(option<=5||option!=0) {
			switch(option) {
			case 1:
				obj1.credit();
				obj1.run1();
				break;
			case 2:
				obj1.net();
				obj1.run1();
				break;
			case 3:
				obj1.upi();
				obj1.run1();
				break;
			case 4:
				obj1.emi();
				obj1.run1();
				break;
			case 5:
				obj1.run();
				obj1.run1();
				break;
			}
			
		}
		}

}
