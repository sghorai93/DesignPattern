package com.design.pattern.factory.bank;

public class ICICI implements Bank {

	private final String bankName;

	public ICICI() {
		super();
		this.bankName = "ICICI";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
