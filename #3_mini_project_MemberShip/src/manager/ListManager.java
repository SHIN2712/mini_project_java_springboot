package manager;

import java.util.ArrayList;
import java.util.Iterator;

import member.Member;

public class ListManager {

	//To-do 회원 관리를 위해 ArrayList를 활용하고, 회원을 추가,삭제, 모든회원을 보여주는 세가지 기능을 제공합니다.
	
	//To-do 생성자를 통해 새로운 멤버리스트를 만듭니다.
	private ArrayList<Member> memberList = new ArrayList<Member>();
	
	public ListManager() {
		
	}
	
	//To-do 회원을 추가하는 메서드를 만듭니다.
	public void addMember(Member newMember) {
		memberList.add(newMember);
	}
	
	//To-do 회원을 삭제하는 메서드를 만듭니다.
	public boolean delMember(int exitMemberId) {
		
		Iterator<Member> ir = memberList.iterator();
		while( ir.hasNext()) {
			Member member = ir.next();
			if( member.getMemberId() == exitMemberId) {
				memberList.remove(member);
				return true;
			}
		}
		
		System.out.println(exitMemberId + "번의 id를 소유한 회원이 존재하지 않습니다.");
		return false;
		
	}
	
	//To-do 모든 회원을 보여주는 메서드를 구현 합니다.
	public void showAllMember() {
		for(Member member : memberList) {
			//To-do 회원정보를 가져오는 getter를 제공합니다.
			int id = member.getMemberId();
			String name = member.getMemberName();
			String grade = member.getMemberGrade();
			System.out.println(name + ", " +  id + ", " + grade);
		}
	}
	
	//To-do 회원정보를 가져오는 getter를 제공합니다.
	public ArrayList<Member> getMemberList() {
			return memberList;
	}
}
	
	
	
	
	
	
	
	
	

	
