package com.design.pattern.factory.bank;

public class PersonalLoan extends Loan{
	
	@Override
	public void getInterestRate(double interestRate) {
		this.interestRate = interestRate;

	}
	
}
