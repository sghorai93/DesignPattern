package com.design.pattern.factory.bank;

public class AbstractFactoryCreator {
	
	public static final String BANK = "Bank";
	public static final String LOAN = "Loan";
	
	
	public static AbstractFactory getFactory(String type) {
		if(type.equals(BANK)) {
			return new BankFactory();
		} else if(type.equals(LOAN)) {
			return new LoanFactory();
		} else {
			throw new RuntimeException("Specify the object type");
		}
	}

}
