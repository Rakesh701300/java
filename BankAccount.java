package com.Rakesh;
//creating class by class name BankAccount
public class BankAccount {
         String accountHolderName;
         int accountNumber,balance;
         //creating Constructor
         public BankAccount(String accountHolderName,int accountNumber,int balance)
         {
        	 this.accountHolderName=accountHolderName;
        	 this.accountNumber=accountNumber;
        	 this.balance=balance; 	 
         }
         //getter and setter methods
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		//creating deposit method 
		public void deposit(int amt)
		{
		   balance+=amt;
		}
		//creating withdraw method 
		public void withdraw(int amt)
		{
			  balance-=amt;
		}
		public static void main(String[] args)
		{
			BankAccount obj=new BankAccount("sbi",1234567,8000);//creating object
			//calling methods
			obj.deposit(3000);
			obj.withdraw(2000);
			
			int balance=obj.getBalance();
			System.out.println("Current balance "+balance);
			String status=(balance>=5000)?"Minmum Balance Maintained":"Minimum Balance not Maintained";
			System.out.println("status ="+status);
		}
}
