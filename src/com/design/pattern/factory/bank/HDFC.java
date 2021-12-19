package com.design.pattern.factory.bank;

public class HDFC implements Bank {

	private final String bankName;

	public HDFC() {
		super();
		this.bankName = "HDFC";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
