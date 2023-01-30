package com.icic.banking;
import com.icic.domain.Account;

public class SavingsAccount extends Account{
public String Nomination;
	public String getNomination() {
	return Nomination;
}

public void setNomination(String nomination) {
	Nomination = nomination;
}

	public SavingsAccount(int accno, String name, float balance) {
	super(accno, name, balance);
}

	public SavingsAccount(int accno, String name, float balance, String nomination) {
	super(accno, name, balance);
	Nomination = nomination;
}

	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		float amount=getBalance();
		if(amount-amt>=1000) {
			 amount=amount-amt;
			setBalance(amount);
			System.out.println("Withdraw");
		}else {
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void deposit(float amt) {
		// TODO Auto-generated method stub
		float amount=getBalance()+amt;
		setBalance(amount);
	}
	
}
