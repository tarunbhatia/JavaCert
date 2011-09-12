package com.cert.Chapter_1;

/*
Demonstrate Classes
*/

public class Classes {

	public Classes() {
		new ClassesC().a();
	}

//	public static  int main(String[] args) {
//		System.out.println("Classes");
//		new Classes();
//	}
	public static void main(String[] args) {
		System.out.println("Classes");
		new Classes();
	}
}

//class ClassesA implements IFaceA {
//
//	public void a() {
//		System.out.println("ClassesA : a()");
//	}
//
//	public void b(int i) {
//	}
//
//}
class ClassesA implements IFaceA {

//	public String a() {
//		System.out.println("ClassesA : a()");
//	}
	public void a() {
	System.out.println("ClassesA : a()");
}

	public void b(int i) {
	}

}

final class ClassesB extends ClassesD {
	public void a() {
		System.out.println("ClassesB : a()");
	}

	public void b(int i) {
	}

	public void one() {

	}
}

// private T
// class ClassesC extends ClassesB{
class ClassesC extends ClassesA {

}

abstract class ClassesD implements IFaceA {
	public abstract void one();

	public final int two() {
		return 0;
	}
}

interface IFaceA {
	int a = 0;
	public int b = 0;
	public static int C = 0;

	public abstract void a();

	public abstract void b(int i);
}

interface IFaceB extends IFaceA {
	int i = 0;

}

interface IFaceC extends IFaceB, IFaceA {
	int i = 0;

}