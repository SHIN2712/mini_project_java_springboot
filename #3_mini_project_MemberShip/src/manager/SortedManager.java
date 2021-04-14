package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import member.Member;

public class SortedManager {
	
	private TreeSet<Member> treeSet;
	
	//To-do 회원을 정렬하여 관리하기 위해 TreeSet을 활용합니다.
	public SortedManager() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	//To-do 회원을 추가하는 메서드를 만듭니다.
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	
	//To-do 회원을 삭제하는 메서드를 만듭니다.
	public boolean removeMember(int exitMemberId) {
		Iterator<Member> ir = treeSet.iterator();
		while( ir.hasNext()) {
			Member member = ir.next();
			if( member.getMemberId() == exitMemberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(exitMemberId + "번의 id를 소유한 회원이 존재하지 않습니다.");
		return false;
	}
	
	//To-do 모든 회원을 보여주는 메서드를 구현 합니다.
	public void showAllMember() {
		//To-do 회원정보를 가져오는 getter를 제공합니다.
		for(Member member : treeSet) {
			int id = member.getMemberId();
			String name = member.getMemberName();
			String grade = member.getMemberGrade();
			System.out.println(name + ", " +  id + ", " + grade);
		}
		System.out.println();
	}
	
	public TreeSet<Member> getMemberList() {
		return treeSet;
}
	
}
