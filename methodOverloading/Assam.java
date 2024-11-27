package methodOverloading;

public class Assam {
	class car{
		int cc=1000;
		int hp = 120;
	}
	class bike{
		int cc=100;
		int  hp=11;
	}
	class mechanic{
		public void service(car c) {
			System.out.println("car service available");
		}
		public void service(bike b) {
			System.out.println("bike service available");
		}
	}
	public static void main(String[] args) {
		Assam a = new Assam();
		mechanic m = a.new mechanic();
		car q = a.new car();
        bike w = a.new bike();
        
        m.service(q);  
        m.service(w);
        }

}
