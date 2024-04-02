package com.jery.PaymentDetails;
import java.util.Scanner;
public class NetBanking extends UPI {
	public void net() {
		HDFC obj1 = new HDFC();
		System.out.println("CHOOSE YOUR BANK");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 For HDFC");
        System.out.println("Enter 2 For IOB");
        System.out.println("Enter 3 For SBI");
        int entry = scan.nextInt();
	   if(entry<=3){
    switch (entry) {
        case 1:
        	System.out.println("Redirecting To The Page");
            obj1.run();
            break;
        case 2:
        	System.out.println("Redirecting To The Page");
            obj1.run1();
            break;
        case 3:
        	System.out.println("Redirecting To The Page");
            obj1.run2();
        break;
        			}
	   	}
   	}	
	}

