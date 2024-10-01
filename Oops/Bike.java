package Oops;

public class Bike {
	static String engine = "100cc";
	String power = "";
	
	static void break() 
	{
		System.out.println("break applied and got accident");
	}
	public static void main(String[] args) {
		Bike honda = new Bike();
		Bike hero = new Bike();
		System.out.println(honda.break());
		System.out.println(hero.break());
	}

}
