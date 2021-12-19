package com.design.pattern.factory.bank;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(BankName bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(LoanType loan) {
		if(loan == null) {
			return null;
		}
		
		switch (loan) {
		case CAR:
			return new CarLoan();
		case EDUCATIONAL:
			return new EducationalLoan();
		case HOME:
			return new HomeLoan();
		case PERSONAL:
			return new PersonalLoan();
		default:
			throw new RuntimeException("Specify Object Type");
		}
	}

}
