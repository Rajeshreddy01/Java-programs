package Oops;

public class A {
	int i=10;
	public void m1() {
		i=12;
		System.out.println(this.i);
		System.out.println(i);
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();		
	}

}
