package chapter05;

public class ModifierPrivate {

	// 변수는 private
	private String name;
	private int age;
	
	// 생성자는 public
	public ModifierPrivate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 은닉된 변수들은 정해진 메소드를 통해서 액세스, 설정한다
	// Getter / Setter
	
	// Getter, get 다음 변수명, 첫 글자 대문자
	public String getName() {
		return this.name;
	}
	
	// Setter, set 다음 변수명, 첫 글자 대문자
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void tell() {
		System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
	}
}
