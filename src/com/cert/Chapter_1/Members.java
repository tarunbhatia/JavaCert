package com.cert.Chapter_1;

/*
 Demonstrate members of classes
 */

public class Members {

	private final static int A = 0;
	private final int b = 1;
	private int c = 1;

	protected final static int D = 200;
	protected final int e = 0;
	protected int f = 0;

	public final static int G = 0;
	public final int h = 0;
	public int i = 0;

	final static int J = 0;
	final int k = 0;
	int l = 0;

	//
//	final static jj = 0;
//	 int kk = 0;
//abstract int ll = 0;
	
	// transient volatile

	// examples of legal declarations
	public int _a;
	protected int $a;
	private int a;
	int ______2_w;

	// example of illegal declarations
	// int #a;
	// int boolean ;
	Members() {
		System.out.println("Members");
	}

	private final int a() {
		return 0;
	}

	private int b() {
		return 0;
	}

	private int c() {
		return 0;
	}

	protected int d() {
		return 0;
	}

	protected final int e() {
		return 0;
	}

	public static final int f() {
		return 0;
	}

//	public static int g() {
//		return "x";
//	}

//	public final String h() {
//		return 0;
//	}

//	synchronized int i() {
//		return 0;
//	}

//	public void int j() {
//		System.out.println("a");
//	}

	native int v();

	// abstract int w();

	public static void main(String args[]) {
		System.out.println("Chapter One");
		Members co = new Members();
		co.a();

		MembersA mA = new MembersA(0);

	}
}

class MembersD extends Members{
	public int a;
	MembersD(){
		this.a =  this.d();
	}
}

// Interfaces
interface MembersIFace {
	// public static final a = 0;
	public static int a = 0;
	public static final int b = 0;
	int c = 0;

	public int a();

	public abstract void b();
}

class MemberC implements MembersIFace {

	MemberC() {

	}

	public int a() {
		return this.a;
	}

	public void b(){
		
	}
}

// abstract classes

// class access
class MembersA {
	private static final int X = 0;

	public void yeh() {
		System.out.println("yeh");
		// Members.D

	}

	public MembersA(int i) {
		System.out.println("MembersA");
		int j = 0;
		Members m = new Members();
		j = m.d();
		// j = m.a();
		j = m.e;
		System.out.println(j);

	}

	public static void main(String args[]) {
		System.out.println("MembersA");
	}

}
