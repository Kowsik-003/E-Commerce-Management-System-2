package com.jery.PaymentDetails;

import java.util.Scanner;

public class IOBEMI extends SBIEMI {
	void run1() {
		System.out.println("MONTH           Interest");
		System.out.println("6  MONTH           4%");
		System.out.println("12 MONTH           8%");
		System.out.println("Enter The Principle Amount");
		Scanner scan = new Scanner(System.in);
		int principle_Amount = scan.nextInt();
		System.out.println("Choose the tenure month");
		System.out.println("Enter 1 for 6 Months");
		System.out.println("Enter 2 for 12 Months");
		int option = scan.nextInt();
		do {
			if(option<=2||option!=0) {
			switch(option) {
			case 1:
				double interest_principle = principle_Amount*0.04d;
				double added_amount = interest_principle + principle_Amount;
				double last = added_amount/6;
				System.out.println("Your monthly Payment is : "+last);
				System.out.println("Press S to continue the payment ");
				char entry = scan.next().charAt(0);
				if(entry=='S'||entry=='s') {
					System.out.println("Enter Your Card Number ");
					int cardnumber = scan.nextInt();
					System.out.println("Enter the OTP");
					int otp = scan.nextInt();
					if(otp == 75877587) {
						System.out.println("Ordered Is Placed Successfully");
						break;
					}
					else {
						System.out.println("Transaction Failed..");
						break;
					}
				}
				else {
					System.out.println("transaction Failed");
					break;
				}
			case 2:
				double interest_principle1 = principle_Amount*0.08d;
				double added_amount1 = interest_principle1 + principle_Amount;
				double last1 = added_amount1/12;
				System.out.println("Your monthly Payment is : "+last1);
				System.out.println("Press S to continue the payment ");
				char entry1 = scan.next().charAt(0);
				if(entry1=='S'||entry1=='s') {
					System.out.println("Enter Your Card Number ");
					int cardnumber = scan.nextInt();
					System.out.println("Enter the OTP");
					int otp = scan.nextInt();
					if(otp == 75877587) {
						System.out.println("Ordered Is Placed Successfully");
						break;
					}
					else {
						System.out.println("Transaction Failed..");
						break;
					}
				}
				else {
					System.out.println("transaction Failed");
					break;
				}
			}
					
			}			
		}
		while(option==0||option>2);
	}


}
