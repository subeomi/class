package chpater08;

public class Main {

	public static void main(String[] args) {
		
		// 3. 다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시
		// 다.
		
		// 부모인 Calculator 인터페이스 타입의 참조변수 cal에 인터페이스를 구현한 CalculatorClass2 타입의 인스턴스를 참조하는 cal.~ 코드
		
		Calculator cal = /* (Calculator) */ new CalculatorClass2();
		
		System.out.println(cal.add(100L, 100L));
		System.out.println(cal.substract(300L, 256L));
		System.out.println(cal.multiply(33L, 22L));
		System.out.println(cal.divide(100, 4));
		
		
	}

}
