package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		int x1 = 2;
		int y1 = 3;
		int sumI = x1 + y1;
		System.out.println("Int sum = " + sumI);
		
		double a = 1.2d;
		double b = 3.5d;
		double sumD = a + b;
		System.out.println("Double sum = " + sumD);
		
		int c = 10;
		double d = 2.75d;
		double sumID = c + d;
		System.out.println("Int & Double sum = " + sumID);
		
		int small = 5;
		int large = 25;
		float large2 = 25.5f;
		int div = large/small;
		float div2 = large2/small;
		System.out.println("intLarge/intSmall = " + div);
		System.out.println("FloatLarge/intSmall = " + div2);
		
		double e = 1.2d;
		double f = 3.5d;
		double divD = f/e;
		System.out.println("Double div = " + divD);
		int divD2 = (int)(f/e);
		System.out.println("(int)(f/e) = " + divD2);
		
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println("y/x = " + q);
		q = (double)y;
		System.out.println("q = (double)y = " + q);
		
		final double PI = 3.14159d;
		double radius = 7;
		double area = Math.pow(radius, 2) * PI;
		System.out.println("named constant, area = " + area);
		
		float  cappuccino = 3.75f, espresso = 2.80f, greenTea = 1.5f;
		float subtotal, totalSale;
		subtotal = cappuccino * 3 + espresso * 4 + greenTea * 2;
		subtotal = Float.parseFloat(String.format("%.2f", subtotal));
		final float SALES_TAX = 1.5f;
		totalSale = subtotal + SALES_TAX;
		//formatting and casting
		totalSale = Float.parseFloat(String.format("%.2f", totalSale));
		System.out.println("Subtotal = " + subtotal);
		System.out.println("Total sale = " + totalSale);
		
		
		
		
	}

}
