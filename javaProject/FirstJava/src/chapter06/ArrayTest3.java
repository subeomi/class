package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[15]; // int 타입의 요소 10개를 가지는 배열 인스턴스

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
		scores[10] = 60;
		scores[11] = 32;
		scores[12] = 55;
		scores[13] = 78;
		scores[14] = 83;
		
		resultPrint(scores);
		
		
	}
	
	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	static void resultPrint(int[] arr) { // int[] arr = scores;
		
		// 전달받은 배열은 : int 타입의 배열이다! size 제약은 없다
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / (float)arr.length;
		
		System.out.println("====================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
	
}
