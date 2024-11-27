package inheritance;
class Human{
	int age;
	String name;
	String gender;
	public Human(int age, String name, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
}
class Doctor extends Human{
	String specalist;

	public Doctor(int age, String name, String gender, String specalist) {
		super(age, name, gender);
		this.specalist = specalist;
	} 
	void display() {
		System.out.println("age : " + age +"\nname : " + name +"\ngender : "+ gender + "\nspecalist : "+ specalist);
	}
}
public class I4 {

	public static void main(String[] args) {
		Doctor d = new Doctor(23, "rajesh", "male","brain" );
		d.display();
	}

}
