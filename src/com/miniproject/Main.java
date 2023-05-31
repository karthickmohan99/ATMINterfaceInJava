package com.miniproject;
import com.miniproject.dao.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		AtmOperationDao atmMethods = new AtmOperationDao();
		
		final int accountNumber = 123456789;
		final int atmPin=1111;
		int accntNumber;
		int pinNumber;
		int choice = 0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Welcome TO EduBridge ATM Service");
		System.out.println("Enter Your ACCOUNT NUMBER:");
		accntNumber=sc.nextInt();
		System.out.println("Enter Your PIN NUMBER:");
        pinNumber =sc.nextInt();
        
        if((accountNumber==accntNumber) && (atmPin ==pinNumber))
        {
        	while(choice!=6)
        	{
        		System.out.println(
						  "\n1.View Available Balance\n"
						+ "2.Withdraw Amount\n"
						+ "3.Depoist Amount\n"
						+ "4.Transfer Money\n"
						+ "5.View Transaction History\n"
						+ "6.Exit\n--------------------------------");
        		
        		System.out.println("Enter Your Choice:");
        		try {
        		choice=sc.nextInt();
        		
        		switch(choice)
        		{
        		case 1:
        			atmMethods.viewBalance();
        			break;
        		case 2:
        			System.out.println("Enter the amount to Withdraw:");
        			int withdrawAmount =sc.nextInt();
        			atmMethods.withdrawAmount(withdrawAmount);
        			break;
        		case 3:
        			System.out.println("Enter the amount to Depoist:");
        			int depositAmount = sc.nextInt();
        			atmMethods.depositAmount(depositAmount);
        			break;
        		case 4:
        			System.out.println("Enter the amount to Transfer:");
        			int transferAmount = sc.nextInt();
        			System.out.println("Enter Receiver Name:");
        			String Receiver = sc.next();
        			atmMethods.transferAmount(transferAmount, Receiver);
        			break;
        		case 5:
        			atmMethods.transactionHistory();
        			break;
        		case 6:
        			System.out.println("Collect Your ATM Card\nThank You For Using ATM Service!!!");
        			break;
        	   default :
        		    System.out.println("Please Enter Your Correct Choice !");
        			
        		}
        		}catch(InputMismatchException e)
        		{
                      System.out.println("you have to type in  required data type [Integer/String]");
        		}
        		sc.nextLine();
        		
        	}
        }else 
        {
			System.out.println("Incorrect ACCOUNT NUMBER Or ATM PIN NUMBER");
	   }

	}}
