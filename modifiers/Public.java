package modifiers;

public class Public {
	int age;
	int id;
public Public(int age, int id) {
	this.age=age;
	this.id=id;
	}
public void display() {
	System.out.println("age : "+age +"\nid : "+id);
}
	public static void main(String[] args) {
		Public p = new Public(12, 4559);
		p.display();
	}

}
