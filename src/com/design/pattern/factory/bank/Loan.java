package com.design.pattern.factory.bank;

public abstract class Loan {
	
	protected double interestRate;

	public abstract void getInterestRate(double interestRate);
	
	public void calculate(double principal, int years) {
        int n = years * 12;  
        interestRate = interestRate / 1200;  
        double emi=((interestRate*Math.pow((1+interestRate),n))/((Math.pow((1+interestRate),n))-1))*principal;  
        System.out.println("You have borrowed = "+principal+" and your monthly EMI will be =  "+emi);
	}

}
