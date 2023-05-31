package com.miniproject.dao;

interface  AtmOPerations {
	public void depositAmount(int depositAmount);
	public void withdrawAmount(int withdrawAmount);
	public void viewBalance();
	public void transactionHistory();
	public void transferAmount(int transferAmount,String Receiver);

}
