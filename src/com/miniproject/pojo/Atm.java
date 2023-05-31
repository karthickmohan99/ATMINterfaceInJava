package com.miniproject.pojo;

public class Atm {
   private int balance;
   private int deposit;
   private int withdrawAmount;
   private int amountTranferedTo;
   
   
 public Atm() {
	super();
	// TODO Auto-generated constructor stub
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getDeposit() {
	return deposit;
}
public void setDeposit(int deposit) {
	this.deposit = deposit;
	
}

public int getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(int withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}
public int getAmountTranferedTo() {
	return amountTranferedTo;
}
public void setAmountTranferedTo(int amountTranferedTo) {
	this.amountTranferedTo = amountTranferedTo;
}

   
}
