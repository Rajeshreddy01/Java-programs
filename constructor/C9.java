package constructor;

public class C9 {
	int i;
	String name;
	public C9(int i,String name) {
		this.i=i;
		this.name=name;
	}
	void display() {
		System.out.println("i : "+ i +" name : "+ name );
	}
	public static void main(String[] args) {
		C9 c = new C9(121, "rajesh");
		c.display();
	}

}
