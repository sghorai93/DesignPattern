package com.design.pattern.factory.bank;

public class EducationalLoan extends Loan{
	
	@Override
	public void getInterestRate(double interestRate) {
		this.interestRate = interestRate;

	}
	
}