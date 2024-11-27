package inheritance;
class G{
	void hello(){
		System.out.println("Avengers");
	}
}
class H extends G{
	void hello() {
		System.out.println("End game");
	}
}
public class Overriding {

	public static void main(String[] args) {
		H h = new H();
		h.hello();
	}

}
