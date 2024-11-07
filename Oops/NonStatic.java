package Oops;

public class NonStatic {
	int i;
	void assam() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		NonStatic a = new NonStatic();// object creation is mandatory for calling non static methods
		a.i=10;// assigning value to the non static variable
		a.assam();// calling the non static method
	}

}
