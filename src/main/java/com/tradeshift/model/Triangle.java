package com.tradeshift.model;

public class Triangle {

	private int a;
	
	private int b;
	
	private int c;
	
	private TriangleType type;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public TriangleType getType() {
		return type;
	}
	
	public void setType(TriangleType tt) {
		this.type = tt;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", type=" + type + "]";
	}
	
}
