package member;

public class Member {
	
	// ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	// ② 위에서 정의한 정보를 출력하는 메소드 정의
	// ③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	// ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		
//		if(birthday != null) {
//			System.out.println("생일 : " + birthday); // null			
//		} else {
//			System.out.println("생일 : 미입력");
//		}
		
		System.out.println("생일 : " + (birthday != null ? birthday : "미입력"));
		System.out.println("주소 : " + (address != null ? address : "미입력"));
		
//		if(address != null) {			
//			System.out.println("주소 : " + address); // null
//		} else {
//			System.out.println("주소 : 미입력");
//		}
		
	}

	public Member(
			String name, 
			String phoneNumber, 
			String major, 
			int grade, 
			String email, 
			String birthday,
			String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	public Member(
			String name, 
			String phoneNumber, 
			String major, 
			int grade, 
			String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	
	public static void main(String[] args) {
		
		Member member1 = new Member(
				"손흥민", 
				"010-9999-7777", 
				"축구", 
				1, 
				"son@gmail", 
				"1990.10.12", 
				"런던");
		member1.printData();
		
		System.out.println();
		
		Member member2 = new Member(
				"박지성", 
				"010-1111-2222", 
				"축구", 
				1, 
				"parkjs@gmail");
		member2.printData();
		
	}
	
	
	
}
