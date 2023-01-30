package com.icic.domain;

public class Employee {
	private int empno;
	private String name;
	private int basicsalary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Employee(int empno, String name, int basicsalary) {
		super();
		this.empno = empno;
		this.name = name;
		this.basicsalary = basicsalary;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}
	
}
