package test;

public class FirstJava {

	public static void main(String[] args) {

//		System.out.println("First JAVA");
		
		// 변수 : 메모리 공간 할당, 메모리 주소의 역할
		// 선언방법
		// 자료형 타입
		
		int age;
		age = 20;
		
		// 원주율 : pi -> 3.141592.... <- 실수
		double pi;
		pi = 3.141592;
		
		System.out.println(age);
		System.out.println(pi);
		
		
		int resultValue = add(10, 20);
		
		System.out.println(resultValue);
		
		hello();
		
		hello2("손흥민");

	}
	
	// 정수 두 개를 받아 -> 매개변수 선언
	// 더하기 연산한 -> 내부 처리
	// 결과를 반환하는 메소드 -> return 결과값;
	static int add(int num1, int num2) {
		int result = num1 + num2;
		
		// 결과값 반환
		return result;
	}
	
	// 기능 : 인삿말을 출력하는 메소드
	// 매개변수 : 데이터
	// 결과 반환 : 반환이 없다
	// void : 반환 값이 없을 때 사용 -> return이 없다
	static void hello() {
		System.out.println("안녕하세요!");
		System.out.println("반갑습니다.");
	}
	
	// 이름을 전달받아 이름과 인사말을 출력하는 메소드
	// 매개변수 : 이름 ( 문자열 )
	// 반환 : 없다!
	static void hello2(String name) {
		System.out.println(name);
		System.out.println("안녕하세요");
	}
}
