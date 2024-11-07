package Oops;

public class StaticVm {
	static String engine = "100cc";
	String power = "";
	
	static void breaks() 
	{
		System.out.println("break applied and got accident");
	}
	public static void main(String[] args) {
		StaticVm honda = new StaticVm();
		StaticVm hero = new StaticVm();
		System.out.println(StaticVm.engine);// static variable is called with class name
		System.out.println(StaticVm.engine);
		System.out.println(hero.power="10 hp");// Non static variable is called with the help of object
		System.out.println(honda.power="12 hp");
		StaticVm.breaks();// static methods can be accessed using class name also with object reference
		StaticVm.breaks();
	}

}
