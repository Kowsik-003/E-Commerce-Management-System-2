package com.jery.PaymentDetails;

import java.util.Scanner;

public class HDFC extends IOB {
	void run(){
		System.out.println("Welcome To HDFC");
		String approve2 = "approve";
		System.out.println("Enter the Username");
		Scanner scan = new Scanner(System.in);
		int username = scan.nextInt();
		System.out.println("Enter the password");
		int password = scan.nextInt();
		System.out.println("Enter approve to complete your payment");
		String approve = scan.nextLine();
		if(approve.equalsIgnoreCase(approve2)) {
			System.out.println("Your order is placed successfully");
		}
	}

}
