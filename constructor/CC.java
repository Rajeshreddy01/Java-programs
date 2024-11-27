package constructor;

public class CC {
	int id;
	String name;
	
	public CC(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public CC(CC other) {
		this.id= other.id;
		this.name= other.name;
	}
	public void display() {
		System.out.println("id :"+id + " name: "+ name);
	}
	public static void main(String[] args) {
		CC c1 = new CC(1,"Rajesh");
		CC c2 = new CC(c1);
		c1.display();
		c2.display();
	}

}
