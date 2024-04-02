package com.jery.PaymentDetails;

import java.util.Scanner;

public class CashOnDelivery extends DeliveryDate{
	int var;
	void run() {
		System.out.println("Enter The Given Captcha");
		System.out.println("785536");
		Scanner scan = new Scanner(System.in);
		var = scan.nextInt();
		while(var==785536) {
			System.out.println("YOUR ORDER IS SUCCESSFULLY PLACED");
			break;
		}
		while(var!=785536){
		System.out.println("Re-Enter The Given Captcha");
		System.out.println("785536");
		var = scan.nextInt();
		}
		while(var==785536) {
			break;
		}
		}

	}


