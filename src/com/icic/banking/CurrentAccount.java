package com.icic.banking;
import com.icic.domain.*;

public class CurrentAccount extends Account {

	private String crn;
	public CurrentAccount(int accno, String name, float balance) {
		super(accno, name, balance);
	}
	public CurrentAccount(int accno, String name, float balance, String crn) {
		super(accno, name, balance);
		this.crn = crn;
	}
	@Override
	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		float amount=getBalance();
		if(amount-amt>=5000) {
			 amount=amount-amt;
				setBalance(amount);
			System.out.println("Withdraw amount");
		}
		else {
			System.out.println("insufficient balance");
		}
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	

	@Override
	public void deposit(float amt) {
		// TODO Auto-generated method stub
				float amount=getBalance()+amt;
				setBalance(amount);
	}

}
