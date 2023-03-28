package Quiz;

import java.util.Calendar;

public class Member {
	
	//  독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다
	static void fluPrev(int n) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		if(year - n + 1 < 15 || year - n + 1 >= 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
	}
	
	// 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다
	static void medicalChk(int n) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int i = year - n + 1;
		if(i >= 20) {
			System.out.println("성인은 무료로 2년마다 검진이 가능합니다.");
			
			if(i % 2 == 0 && year % 2 == 0) {
				System.out.println("귀하는 올해 검진대상입니다.");
			}
			
			if(i >= 40) {
				System.out.println("40세 이상은 암 검사도 무료로 검사가 가능합니다.");
			}
		}
	}
	
	// Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요. 
	// 단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다. 
	
	// 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String phoneNumber;
	String major;
	int grade;
	String email;
	int birthDay;
	String address;
	
	// 위에서 정의한 정보를 출력하는 메소드 정의
	void showChap5() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("email : " + email);
		System.out.println("생일 : " + birthDay);
		System.out.println("주소 : " + address);
	}
	
	// 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	public Member(String name, String phoneNumber, String major, int grade, String email, int birthDay, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthDay = birthDay;
		this.address = address;
	}
	
	public Member(String name, String phoneNumber, String major, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	

	public static void main(String[] args) {
		System.out.println("이수범");

		String name = "이수범";
		int age = 29;
		double height = 174;
		boolean hasBook = true;
		
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n키 : " + height + "\n책 보유 여부 : " + hasBook);
		
		fluPrev(2010);
		medicalChk(1985);
		System.out.println();
		
		// main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
		Member m1 = new Member("이수범", "010-4944-2396", "JAVA", 10, "tnqjarnqja@gmail.com", 950714, "일산");
		Member m2 = new Member("이수범", "010-4944-2396", "JAVA", 10, "tnqjarnqja@gmail.com");
		
		m1.showChap5();
		System.out.println();
		m2.showChap5();
	}

}
