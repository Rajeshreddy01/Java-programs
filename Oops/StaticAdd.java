package Oops;

public class StaticAdd {
	static int x, y;
	static void add() {
		System.out.println("sum of x and y is "+ (x+y));
	}
	public static void main(String[] args) {
		StaticAdd.x=12; // this is for passing values to the variables
		StaticAdd.y=11;
		StaticAdd.add();
		//StaticAdd.add(12,13); 
//		StaticAdd a = new StaticAdd();
//		a.add(12, 14);
	}

}
// if there is no return type for method then no need of writing the return 
// And if we provide arguments to the method we need to pass the values to the method while calling the method using class name
// also we can pass the values using object reference