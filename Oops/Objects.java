package Oops;

public class Objects {
	int bal;
	void add() {
		System.out.println(bal);
	}
	public static void main(String[] args) {
		Objects a = new Objects();
		a.bal=12345;
		a.add();
	}

}
