package Quiz;

import java.util.Scanner;

public class Calculator {
	static int add(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int mult(int a, int b) {
		return a * b;
	}
	
	static int divi(int a, int b) {
		return a / b;
	}
	
	
	// 3챕터
	// ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add3(int a, int b) {
		System.out.println(a + b);
	}
	
	// ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	static void sub3(int a, int b) {
		System.out.println(a - b);
	}
	
	// ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	static void mul3(int a, int b) {
		System.out.println(a * b);
	}
	
	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	static void div3(int a, int b) {
		System.out.println(a / b);
	}
	
	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	static void cir3(float a) {
		System.out.println(a * 3.14 * 2);
	}
	
	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
	// 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	static void area3(float a) {
		System.out.println(a * a * 3.14);
	}
	
	// ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	public static void main(String[] args) {
		add3(1, 2);
		sub3(2, 1);
		mul3(2, 2);
		div3(10, 2);
		cir3(3.5f);
		area3(2.5f);

		// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
		// 에 추가해봅시다.
		Scanner sc = new Scanner(System.in);
		System.out.println("더할 두 수를 입력해주세요.\n예)1 2");
		int i = sc.nextInt();
		int j = sc.nextInt();
		add3(i, j);
	}
}
