package constructor;

public class Student {
	int id;
	String name;
	int age;
	String branch;
	static String address;
	static String collName;
	
	
	public Student(int id,String name, int age, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	public void displayStudentDetails() {
		System.out.println("id : "+ this.id);
		System.out.println("name : "+ this.name);
		System.out.println("age : "+ this.age);
		System.out.println("branch : "+ this.branch);
		System.out.println("address : "+ this.address);
		System.out.println("collname : "+ this.collName);
		System.out.println("****");

	}
	public static void changeCollAddress(String address) {
		Student.address = address;
	}
	public static void changeCollName(String collName) {
		Student.collName = collName;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1,"rajesh", 24, "Java");
		Student s2 = new Student(2, "Ramu", 23, "Python");
		Student.address = "marathahalli";
		Student.collName = "Jspiders";
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		Student.changeCollAddress("Btm Layout");
		Student.changeCollName("pyspiders");
		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}

}
