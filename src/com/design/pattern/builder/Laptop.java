package com.design.pattern.builder;

public class Laptop {
	
	private String brand;
	private String processor;
	private int ram;
	private String color;
	
	
	public Laptop(String brand, String processor, int ram, String color) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", processor=" + processor + ", ram=" + ram + ", color=" + color + "]";
	}
	
}
