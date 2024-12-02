package arrays;

public class D2 {

	public static void main(String[] args) {
//		int[][] i = {{1,2,3},{4,5}};
//		System.out.println(i[0][2]);
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0; i < myNumbers.length; ++i) {
		  for (int j = 0; j < myNumbers[i].length; ++j) {
		    System.out.println(myNumbers[i][j]);
		  }
		}
	}

}
