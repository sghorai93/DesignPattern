package com.design.pattern.factory.bank;

public class AXIS implements Bank {
	
	private final String bankName;

	public AXIS() {
		super();
		this.bankName = "AXIS";
	}

	@Override
	public String getBankName() {
		return bankName;
	}
	
}
