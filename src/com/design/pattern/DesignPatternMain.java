package com.design.pattern;

import com.design.pattern.builder.Laptop;
import com.design.pattern.builder.LaptopBuilder;
import com.design.pattern.factory.OSType;
import com.design.pattern.factory.OperatingSystem;
import com.design.pattern.factory.OperatingSystemFactory;

public class DesignPatternMain {

	public static void main(String[] args) {
		
		/*
		 * This is Factory Design Pattern. Part of Creational Design Pattern
		 */
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		OperatingSystem operatingSystem = operatingSystemFactory.getInstance(OSType.LINUX);
		operatingSystem.show();
		
		
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
