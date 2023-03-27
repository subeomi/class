package chapter05.phone;

public class SmartPhone {

	// iv
	String color;
	float size;
	int volume;
	
	// 생성자 : 초기화 메소드, 인스턴스 변수의 초기화 작업
	// 초기화 작업이 없는 경우 생략 가능
	// 아래와 같은 생성자 -> 기본 생성자
//	SmartPhone() {
//		System.out.println("인스턴스 생성!");
//	}
	
	// 초기화를 위한 생성자 정의
	SmartPhone(String color,float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	// 생성자 오버로딩 : 볼륨 미입력, 기본 0
	SmartPhone(String color, float size) {
		this(color, size, 0); // this() -> 다른 생성자의 호출
	}
	
	SmartPhone() {
		this("white", 4.5f, 5);
	}
	
	void call() {
		System.out.println("전화 걸기");
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
	
	
	
	
	
	
	
	
}
