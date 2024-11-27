package constructor;

public class C8 {
	int len;
	int bre;
	public C8(int len, int bre) {
		this.len=len;
		this.bre=bre;
	}
	public C8(int data) {
		this(data,data);
	}
	public void display() {
		System.out.println("len :"+len + " bre: "+ bre);
	}
	public static void main(String[] args) {
		C8 c = new C8(12, 13);
		C8 c1 = new C8(10,38);
		c.display();
		c1.display();
	}

}
