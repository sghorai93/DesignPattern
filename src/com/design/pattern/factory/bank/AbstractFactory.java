package com.design.pattern.factory.bank;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(BankName bank);
	public abstract Loan getLoan(LoanType loan);

}
