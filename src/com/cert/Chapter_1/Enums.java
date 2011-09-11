package com.cert.Chapter_1;

/*
Demonstrate members of enums
*/

public class Enums {

	enum CoffeSize {
		BIG, HUGE, BIGGER
	};

	// not to convention Sun code convention
	enum sizes {
		big, Huge, bigger
	};

	// semi-colon optional
	enum sizes2 {
		big, Huge, bigger
	}

	public static void main(String[] args) {

		// enum sizes3 {
		// big, Huge, bigger
		// }

		CoffeSize cs = CoffeSize.BIG;

		System.out.println("Enums:");

		System.out.println(cs);
		System.out.println(new Coffee().s);

		Tea t = Tea.BIG;
		System.out.println(t.getOunces());
	}
}

class Coffee {
	public static Sizes s = Sizes.LARGE;

	Coffee() {
		s = Sizes.SMALL;
	}
}

enum Tea {
	// 8, 10 & 16 are passed to the constructor
	BIG(8), HUGE(10), OVERWHELMING(16);
	Tea(int ounces) { // constructor
		this.ounces = ounces;
	}

	private int ounces;

	// an instance variable
	public int getOunces() {
		return ounces;
	}
}

enum Sizes {
	SMALL, MEDIUM, LARGE
}
// private 