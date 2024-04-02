package com.jery.PaymentDetails;

import java.util.Scanner;

public class UPI extends EMI {
	public void upi() {
		System.out.println("Enter The UPI Id :");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Please Pay The Amount In The Respected UPI App And Press Y");
		char output = scan.next().charAt(0);
		if(output=='Y'||output=='y') {
			System.out.println("Ordered Is Placed Successfully");
		}
		else {
			System.out.println("FAILED");
		}
	}
}
