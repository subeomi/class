package chapter08;

public class Main {

	public static void main(String[] args) {
		
		AbstractClass abstractClass; // 참조변수 선언, 상위타입(부모타입. 상속의 목적)
//		abstractClass = new AbstractClass(); // 인스턴스 생성 불가!
		
		NewClass class1 = new NewClass();
		class1.abstractMethod();
		class1.instanceMethod();
		class1.printData();
	}
	
	
}
