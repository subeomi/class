package collection;

// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성 -> 배열 -> List
public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlayer() {
		// 기본생성자 (수퍼클래스)
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 
	// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.team.hashCode() + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fp = (FootballPlayer) obj;
//			if(fp.name.equals(this.name) && fp.team.equals(this.team) && fp.age == this.age) {
//				result = true;
//			}
			result = this.team.equals(fp.getTeam()) 
					&& this.name.equals(fp.getName()) 
					&& this.age == fp.getAge();
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

	// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 
	// 같은 팀의 선수들은 이름 순으로 정렬하고, 
	// 같은 이름의 선수는 번호 순으로 저장하는 
	// 프로그램을 만들어 봅시다. 
//	public int compareTo(FootballPlayer o) {
//		int chk = 0;
//		if(team.compareTo(o.getTeam()) > 0) {
//			chk = 1;
//		} else if(team.compareTo(o.getTeam()) < 0){
//			chk = -1;
//		} else if(name.compareTo(o.getName()) > 0) {
//			chk = 1;
//		} else if(name.compareTo(o.getName()) < 0) {
//			chk = -1;
//		} else if(number > o.getNumber()) {
//			chk = 1;
//		} else if(number < o.getNumber()) {
//			chk = -1;
//		}
//		return chk;
//	}
	
	public int compareTo(FootballPlayer o) {
		int compare = this.team.compareTo(o.getTeam());
		if(compare == 0) {
			compare = this.name.compareTo(o.getName());
			if(compare == 0) {
				compare = this.number - o.getNumber();
//				compare = Integer.compare(this.number, o.getNumber());
			}
		}
		return compare;
	}
	

}
	
	

