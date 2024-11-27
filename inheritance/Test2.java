package inheritance;
class R{
	public R() {
		System.out.println("Constructor with zero arg from parent class");
	}
}
class T extends R{
	public T() {
		System.out.println("Constructor with zero arg from child class");
	}
	int i;
	public T(int i) {
		this.i=i;
		System.out.println(i);
		System.out.println("parametarized con of child class");
	}
}
public class Test2 {

	public static void main(String[] args) {
		T t = new T();
		T y = new T(12);
	}

}
