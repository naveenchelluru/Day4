package com.icic.banking;

import com.icic.domain.Account;


public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account a1=new Account(1,"Niharika",10000);
//		a1.display();
//		Account a2=new Account(2,"Nitya",20000);
//		a2.display();
		Account a1=new SavingsAccount(1, "Naveen", 5000, "Nityal");
		a1.withdraw(4500);
		a1.deposit(3000);
		System.out.println(a1.getBalance());
		
		Account a2=new CurrentAccount(2, "niharaki", 10000,"zkjcsnk");
		a2.withdraw(9000);
		a2.deposit(2000);
		System.out.println(a2.getBalance());
	
	}

}
                            