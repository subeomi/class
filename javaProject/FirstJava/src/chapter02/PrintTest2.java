package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {
		
		String name = "손흥민";
		
		// 안녕하세요! 저는 000 입니다. 나이는 00살 입니다.
		
		System.out.print("안녕하세요! 저는 ");
		System.out.print(name);
		System.out.print("입니다.\n");
		
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d살 입니다.\n", name, 20);
		
		System.out.printf("정수 : %d, 실수 : %f\n문자 : %c, 문자열 : %s", 10, 13.5, 'Z', "KING");
//		정수 : 10, 실수 : 13.500000
//		문자 : Z, 문자열 : KING
		
		

	}

}
