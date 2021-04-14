package member;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	//Todo 일반 회원 클래스의 속성은 아이디, 이름, 등급(FAMILY) 세가지 입니다.
	
	
	protected int memberId;
	protected String memberName;
	protected String memberGrade;
	
	public Member() {
	//To-do 일반 멤버의 기본 등급을 FAMILY로 만들어 줍니다.
		memberGrade = "FAMILY";
	}
	
	public Member(int memberId, String memberName) {
	// To-do
		this.memberId = memberId;
		this.memberName = memberName;
		
		memberGrade = "FAMILY";
	}
	
	
	// To-do 일반 회원 클래스의 각 속성에 getter/setter를 제공합니다.
	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberGrade() {
		return memberGrade;
	}


	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	
	// To-do 회원 정보를 보여주는 showMemberInfo 메서드를 구현합니다.
	public String showMemberInfo() {
		
		return memberName + "님의 등급은 " + memberGrade + "입니다.";
	}

	
	//To-do 회원을 이름 순으로 정렬하기 위해 Comparable 메서드를 구현합니다.
	@Override
	public int compare(Member member1, Member member2) {

//		if (member1.getMemberName() > member2.getMemberName()) {
//			return 1;
//		}
//		else if (member1.getMemberName() < member2.getMemberName()) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		return (member1.memberName.compareTo(member2.memberName));
	}
}
