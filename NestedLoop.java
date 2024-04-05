package practice;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 4;
		int number =1;
		
		for(int i = 1; i <= rows; i ++) {
			for( int j = 1; j <= rows - i; j++) {
				
				System.out.print(number + " ");
				number ++;
			}
			System.out.println();
		}

	}

}
