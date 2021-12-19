package com.design.pattern.builder;

public class LaptopBuilder {
	
	private String brand;
	private String processor;
	private int ram;
	private String color;
	
	public LaptopBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public LaptopBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public LaptopBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public LaptopBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public Laptop getLaptop() {
		return new Laptop(brand, processor, ram, color);
	}
	
}
