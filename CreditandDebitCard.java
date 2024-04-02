package com.jery.PaymentDetails;

import java.util.Scanner;

public class CreditandDebitCard extends NetBanking {
	public void credit() {
		System.out.println("Enter Your Credit or Debit Card Number ");
		Scanner scan = new Scanner(System.in);
		int cardnumber = scan.nextInt();
		System.out.println("Enter the Expiry Date");
		String date = scan.nextLine();
		System.out.println("Enter the OTP");
		int otp = scan.nextInt();
		if(otp == 75877587) {
			System.out.println("Ordered Is Placed Successfully");
		}
		else {
			System.out.println("Transaction Failed..");
		}
	}
}
