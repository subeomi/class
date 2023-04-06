package collection;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<FootballPlayer> fpTree = new TreeSet<>();
		
		fpTree.add(new FootballPlayer("손흥민", 6, "맨유", 30));
		fpTree.add(new FootballPlayer("손흥민", 7, "맨유", 30));
		fpTree.add(new FootballPlayer("양흥민", 6, "토트넘", 30));
		fpTree.add(new FootballPlayer("곽흥민", 7, "토트넘", 30));
		fpTree.add(new FootballPlayer("손흥민", 8, "맨유", 30));
		fpTree.add(new FootballPlayer("손흥민", 10, "토트넘", 30));
		fpTree.add(new FootballPlayer("양흥민", 8, "토트넘", 30));
		fpTree.add(new FootballPlayer("양흥민", 9, "토트넘", 30));
		
		// TreeSet
		System.out.println("나의 팀 선수 정보");
		for(FootballPlayer player : fpTree) {
			player.showInfo();
		}
	}
	
}
