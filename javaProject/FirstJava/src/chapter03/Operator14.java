package chapter03;

public class Operator14 {

	public static void main(String[] args) {
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2;
		
		System.out.println(snum1);
		
		System.out.println();
		
		int num = 10;
		
		num +=5; // num = num + 5 -> num = 10 + 5
		System.out.println(num);
		
		num -= 5;
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /= 2;
		System.out.println(num);
		
		num %= 3;
		System.out.println(num);
	}
}
