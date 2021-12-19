package com.design.pattern.factory.bank;

public class CarLoan extends Loan{
	
	@Override
	public void getInterestRate(double interestRate) {
		this.interestRate = interestRate;

	}
	
}
