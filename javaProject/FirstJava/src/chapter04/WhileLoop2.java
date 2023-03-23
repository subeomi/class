package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num < 10) {
			
			int n = 2;
			
			while(n < 10) {
				System.out.print(n + " x " + num + " = " + n*num + "\t");
				n++;
			}
			
			System.out.println();
			num++;
		}
		
	}
}
