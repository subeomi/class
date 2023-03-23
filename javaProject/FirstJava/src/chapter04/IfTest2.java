package chapter04;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 50;
		
		if(score >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		/*
		 * if(scroe < 60) { System.out.println("FAIL") }
		 */
		
		int age = 20;
		
		if(age > 19) {
			System.out.println("투표가 가능합니다.");
		} else {
			System.out.println("아직 투표권이 없습니다.");
		}
		
		// 짝수/홀수 판단하는 프로그램
		
		int num = 5;
		
		if(num % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}

}
