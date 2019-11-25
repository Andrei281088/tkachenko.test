package nik.and;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("World");
		double l = 7;
		System.out.println("Square of rectangle with side length " + l + " is - " + square(l));
		double a= 12;
		double b = 8;
		System.out.println("Square is - " + square(a,b));
	}

	public static void hello(String name){
		System.out.println("Hello, " + name + "!");
	}

	public static double square(double l){
		double square = l * l;
		return square;
	}

	public static double square(double a, double b){
		double square = a * b;
		return square;
	}
}