package Oops;

public class NonSadd {
	int i,j;
	void add() {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		NonSadd a = new NonSadd();
		a.i=12;
		a.j=13;
		a.add();
		NonSadd b = new NonSadd();
		b.i=13;
		b.j=14;
		b.add();
		}

}
