package com.tradeshift.main;

import java.util.Scanner;

public class Application {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println(TriangleApplication.getTypeOfTriangle(s.nextInt(), s.nextInt(), s.nextInt()));
	}

}
