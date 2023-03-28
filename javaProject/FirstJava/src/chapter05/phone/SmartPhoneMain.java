package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone("RED", 5.0f, 10);
		SmartPhone sp2 = new SmartPhone("GOLD", 4.0f);
		SmartPhone sp3 = new SmartPhone();
		
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp1.volume);
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		System.out.println(sp2.volume);
		System.out.println(sp3.color);
		System.out.println(sp3.size);
		System.out.println(sp3.volume);
		
	}
	
}