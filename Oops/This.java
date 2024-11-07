package Oops;

public class This {
	int i=10;
	void m1() {
		System.out.println(i);
		i=12;
		System.out.println(i);
	}

	public static void main(String[] args) {
		This a = new This();
		a.m1();		
	}

}
