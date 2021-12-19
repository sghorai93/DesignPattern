package com.design.pattern.factory.bank;

public class HomeLoan extends Loan {

	@Override
	public void getInterestRate(double interestRate) {
		this.interestRate = interestRate;
		
	}

}
