package com.cert.Chapter_2;

public class Encapsulation {

	public Encapsulation() {

	}

	private Encapsulation(int i) {
		Box b = new Box();
		int bSize = b.size;
		
		System.out.println(bSize);
		System.out.println(b.getSize());
		
		Ball ball = new Ball();
		int ballSize = ball.size; // I can read it ???
		//ball.size = 2; // final
		System.out.println(ballSize);
		
		// bounce the ball from the A class
		A a = new A();
	}

	public static void main(String[] args) {
		// call the private constructor
		Encapsulation e = new Encapsulation(0);
		Ball a = e.new Ball();

	}

	protected final class Ball {
		private final int size = 100;
		Ball() {
		}

		public void bounce() {
			System.out.println("bounce");			
		}
	}

	private final class Box {
		// protect the instance variable; only an instance
		// of Box can access it
		private int size;

		Box() {
			size = 200;
		}

		// Provide public getters and setters
		public int getSize() {
			return size;
		}

		public void setSize(int newSize) {
			size = newSize;
		}
	}

}

final class A {
	A() {
		Encapsulation e = new Encapsulation();
		Encapsulation.Ball a = e.new Ball();
//		Encapsulation.Box box = e.new Box(); // private class
		a.bounce();
	}
}