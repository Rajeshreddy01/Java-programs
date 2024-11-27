package inheritance;
class phone{
	int ram;
	String brand;
	double price;
	String color;
	public phone(int ram, String brand, double price, String color) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	void display() {
		System.out.println("ram : " +ram+ " \nbrand : "+brand+ " \nprice : " +price+ " \ncolor : " + color);
		System.out.println("*****");
	}
}
class iphone extends phone{
	String camera;

	public iphone(int ram, String brand, double price, String color, String camera) {
		super(ram, brand, price, color);
		this.camera = camera;
	}
	@Override
	void display() {
		System.out.println("ram : " +ram+ " \nbrand : "+brand+ " \nprice : " +price+ " \ncolor : " + color+" \ncamera : "+camera);
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		phone p = new phone(3, "Asus", 8999.00, "grey");
		p.display();
		iphone i = new iphone(8, "moto", 15999.00, "black", "samsung");
		i.display();
	}

}
