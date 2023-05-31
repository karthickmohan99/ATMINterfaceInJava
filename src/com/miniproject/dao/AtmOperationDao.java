package com.miniproject.dao;
import com.miniproject.pojo.*;
import java.util.*;
public class AtmOperationDao implements AtmOPerations
{
	TreeMap<Integer,String>transactionHistory=new TreeMap<Integer,String>();
	Atm atmPojo = new Atm(); 
	
	
	//Balance
	@Override
	public void viewBalance() {
	  System.out.println("Your Available Balance is:"+ atmPojo.getBalance()+"$");
		
	}
	
	//Deposit
	@Override
	public void depositAmount(int depositAmount) 
	{
		if(depositAmount >500) 
		{   
			
			atmPojo.setBalance(atmPojo.getBalance()+depositAmount);
			transactionHistory.put(depositAmount, "Amount Deposited");
			System.out.println("----->Deposited Successfully");
			viewBalance();
		}
		else {
			System.out.println("Please note that deposit exceeding 500-/ only accepted");
			
		     }

		
		
	}
   
	//Withdraw
	@Override
	public void withdrawAmount(int withdrawAmount) {
		if(withdrawAmount % 100==0 && withdrawAmount%500 == 0)
		{
			if(withdrawAmount<= atmPojo.getBalance())
			{
			  transactionHistory.put(withdrawAmount,"Amount Withdrawel");
			  System.out.println("Collect the Case----->"+withdrawAmount);
			  atmPojo.setBalance(atmPojo.getBalance()-withdrawAmount);
			  viewBalance();
			}else
			{
				System.out.println("Insufficient Balance");
			}
		}else 
		{
			System.out.println("Please enter the amount multiples of 500 or 100");
		}
		
		
	}

	//Transfer
	@Override
	public void transferAmount(int transferAmount,String Receiver) 
	{
	  
		   atmPojo.setBalance(atmPojo.getBalance()-transferAmount);
		   transactionHistory.put(transferAmount,"Amount Transferred to "+Receiver);
		   System.out.println(transferAmount+" is"+" transferred to "+Receiver);
	 
		
	}
	
	//TransactionHistory
	@Override
	public void transactionHistory() {
		for(Map.Entry m:transactionHistory.entrySet()) 
		{
			 System.out.println("Transaction history:\n"+m.getKey()+" "+m.getValue());
		}
	}

	
   
}
