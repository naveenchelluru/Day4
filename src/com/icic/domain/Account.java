package com.icic.domain;

public abstract  class Account {
	 private int accno;
	   private String name;
	   private float balance;        
	   public abstract void  withdraw(float amt);
	    public abstract void deposit(float amt);
	   
	public Account(int accno, String name, float balance) {
			super();
			this.accno = accno;
			this.name = name;
			this.balance = balance;
		}

	public Account() {
		super();
	}

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void display() {
		System.out.println(accno+" "+name+" "+balance);
	}
}
