package Quiz;

import java.util.Scanner;

public class getSet {

	private String name;
	private String pn;
	private String email;
	private String address;
	private String bd;
	private String group;
			
	public getSet(String name, String pn, String email, String address, String bd, String group) {
		this.name = name;
		this.pn = pn;
		this.email = email;
		this.address = address;
		this.bd = bd;
		this.group = group;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPn() {
		return this.pn;
	}
	
	public void setPn(String pn) {
		this.pn = pn;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBd() {
		return this.bd;
	}
	
	public void setBd(String bd) {
		this.bd = bd;
	}
	
	public String getGroup() {
		return this.group;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	void tell() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + pn);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + bd);
		System.out.println("그룹 : " + group);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력하세요.");
		String pn = sc.nextLine();
		
		System.out.println("이메일을 입력하세요.");
		String email = sc.nextLine();
		
		System.out.println("주소를 입력하세요.");
		String address = sc.nextLine();
		
		System.out.println("생일을 입력하세요.");
		String bd = sc.nextLine();
		
		System.out.println("그룹을 입력하세요.");
		String group = sc.nextLine();
		
		getSet gs = new getSet(name, pn, email, address, bd, group);
		gs.tell();
		System.out.println();
		
		System.out.println("전화번호 변경");
		pn = sc.nextLine();
		
		System.out.print("변경된 전화번호 :" + gs.getPn() + " -> ");
		
		gs.setPn(pn);
		
		System.out.println(pn);
		System.out.println();
		
		gs.tell();
		
		sc.close();
	}
}
