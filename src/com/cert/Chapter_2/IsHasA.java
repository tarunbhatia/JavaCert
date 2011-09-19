package com.cert.Chapter_2;


public class IsHasA {
	
	public static void main(String[] args) {
		System.out.println("xxx");
	}

	private class Car{
		
	}
	// Subaroo is a car
	private class Subaroo extends Car{
		
	}

	// Horse Is An Animal, Has A halter
	private class Animal { }
	private class Horse extends Animal {
		private String jalter;
	}

}


//> Encapsulation (Jose)
//> Inheritance (Jose)
//> Polymorphism (Jose)
//> Overloading/Overriding (Jose)