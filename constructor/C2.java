package constructor;

public class C2 {
	
		int id;
		String name;
		C2(int id,String name){
			this.id = id;
			this.name = name;
		}
		
	public static void main(String[] args) {
		C2 c2a = new C2(1234,"raju");
		System.out.println("id :"+ c2a.id+" "+"name :"+ c2a.name);
	}

}
