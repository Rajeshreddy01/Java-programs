package inheritance;
class J{
	static void tvs(){
		System.out.println("XL super");
	}
}
class K extends J{
//	void tvs() {
//		System.out.println("Apache");
//	}
}
public class Overriding1 {

	public static void main(String[] args) {
		K k = new K();
		k.tvs();
		
	}

}
