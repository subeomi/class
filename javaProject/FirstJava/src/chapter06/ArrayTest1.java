package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("======================");
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index -> 0 ~ 개수 - 1
		// 요소의 개수 -> 배열변수.length
		
		scores[0] = 64;
		scores[1] = 73;
		scores[2] = 90;
		scores[3] = 51;
		scores[4] = 78;
		scores[5] = 90;
		scores[6] = 100;
		scores[7] = 81;
		scores[8] = 48;
		scores[9] = 25;
		// scores[10] = 60;
		
		// System.out.println(scores[1]);
		// index -> 0 ~ 9
		
		// 총합
		int sum = 0;
		// 평균
		float avg = 0.0f;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			// 합의 연산
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
}
