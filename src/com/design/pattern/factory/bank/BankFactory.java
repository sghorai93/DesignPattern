package com.design.pattern.factory.bank;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(BankName bank) {
		
		if(bank == null) {
			throw new RuntimeException("Bank name can not be null");
		}
		
		switch (bank) {
		case AXIS:
			return new AXIS();
		case HDFC:
			return new HDFC();
		case ICICI:
			return new ICICI();
		default:
			throw new RuntimeException("Specify Object Type");
		}
		
	}

	@Override
	public Loan getLoan(LoanType loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
