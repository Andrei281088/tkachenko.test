package nik.and;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("World");
		square s = new square(8);
		//s.a = 7;
		System.out.println("Square of rectangle with side length " + s.a + " is - " + s.sq());
		rectangle r = new rectangle(9, 12);
		//r.a= 12;
		//r.b = 8;
		System.out.println("Square is - " + r.sq());
	}

	public static void hello(String name){
		System.out.println("Hello, " + name + "!");
	}




}