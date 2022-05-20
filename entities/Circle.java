package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private Double radius;
	public static final double PI = 3.14;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return PI * radius * radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
}
