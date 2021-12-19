package com.design.pattern;

import com.design.pattern.builder.Laptop;
import com.design.pattern.builder.LaptopBuilder;
import com.design.pattern.factory.OSType;
import com.design.pattern.factory.OperatingSystem;
import com.design.pattern.factory.OperatingSystemFactory;
import com.design.pattern.factory.bank.AbstractFactory;
import com.design.pattern.factory.bank.AbstractFactoryCreator;
import com.design.pattern.factory.bank.Loan;
import com.design.pattern.factory.bank.LoanType;

public class DesignPatternMain {

	public static void main(String[] args) {
		
		/*
		 * This is Factory Design Pattern. Part of Creational Design Pattern
		 */
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		OperatingSystem operatingSystem = operatingSystemFactory.getInstance(OSType.LINUX);
		operatingSystem.show();
		
		/*
		 * This is Factory Design Pattern using Bank example. Part of Creational Design Pattern
		 */
		Double principal = 3000000.00;
		Double interestRate = 7.50;
		int years = 20;
		
		AbstractFactory abstractLoanFactory = AbstractFactoryCreator.getFactory(AbstractFactoryCreator.LOAN);

		Loan loan = abstractLoanFactory.getLoan(LoanType.HOME);
		
		loan.getInterestRate(interestRate);
		loan.calculate(principal, years);
		
		
		
		/*
		 * This is Builder Design Pattern. Part of Creational Design Pattern
		 */
		Laptop laptop = new LaptopBuilder()
				.setBrand("DELL")
				.setProcessor("Intel i5")
				.setRam(4)
				.setColor("Black")
				.getLaptop();
		System.out.println(laptop);

	}

}
