package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		
		ArrayList<FootballPlayer> myTeam = new ArrayList<>(); // 앞에 이미 타입을 정했기 때문에 뒤에선 생략이 가능하다
		
		myTeam.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		myTeam.add(new FootballPlayer("박지성", 7, "맨유", 40));
		
		Set<FootballPlayer> fpSet = new HashSet<>();
		
		fpSet.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		fpSet.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		fpSet.add(new FootballPlayer("손흥민", 7, "맨유", 30));
		fpSet.add(new FootballPlayer("손흥민", 7, "맨유", 32));
		fpSet.add(new FootballPlayer("손흥민", 7, "맨유", 30));
		fpSet.add(new FootballPlayer("이강인", 8, "맨유", 20));
		fpSet.add(new FootballPlayer("이강인", 8, "맨유", 20));

		
		// ArrayList
		System.out.println("나의 팀 선수 정보");
		for(FootballPlayer player : myTeam) {
			player.showInfo();
		}
		
		System.out.println("------------------------------");
		
		// Set
		System.out.println("나의 팀 선수 정보");
		for(FootballPlayer player : fpSet) {
			player.showInfo();
		}
		
		System.out.println("------------------------------");
		
		
		
//		myTeam.stream().forEach((FootballPlayer p) -> p.showInfo());
//		
//		myTeam.stream().forEach(System.out::println);
		
	}

}
