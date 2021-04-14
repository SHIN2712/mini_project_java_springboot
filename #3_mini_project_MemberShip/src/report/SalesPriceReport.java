package report;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import manager.BasicSalesRatio;
import manager.SalesRatio;
import manager.VIPSalesRatio;
import member.Member;

public class SalesPriceReport {

	List<Member> list;
	public String FamilyMembers = "";
	public String VIPMembers = "";
	
	double ratio = 0.0;
	SalesRatio salesStrategy[] = {new BasicSalesRatio() , new VIPSalesRatio()};
	
	// FAMILY 등급과 VIP 등급의 세일즈 전략을 2가지로 결정합니다.
	public SalesPriceReport(List<Member> list) {

		Iterator<Member> ir = list.iterator();
		while( ir.hasNext()) {
			Member member = ir.next();
			if( member.getMemberGrade() == "FAMILY") {
				FamilyMembers += member.getMemberName() + ", ";
				
			}
			else {
				VIPMembers += member.getMemberName() + ", ";
			}
		}
		
		FamilyMembers = FamilyMembers.substring(0, FamilyMembers.length()-2);
		VIPMembers = VIPMembers.substring(0, VIPMembers.length()-2);		
	}
	
	public void generateSaleReport(int price) {
		
		
		// To-do 모든 FAMILY 등급의 회원과, VIP 등급의 회원의 세일즈 보고서를 만듭니다.
		
		int salePrice = 0;
		
		SalesRatio family = salesStrategy[0];
		ratio = family.getSalesRatio(price);
		salePrice = Integer.parseInt(String.valueOf(Math.round(price * (1-ratio))));
		// FAMILY 등급
		
		System.out.println("FAMILY Member들의 가격에 따른 세일 비율은 " + ratio + "이며, 최종 가격은 " + salePrice + "입니다."); 
	
		
		SalesRatio vip = salesStrategy[1];
		ratio = vip.getSalesRatio(price);
		salePrice = Integer.parseInt(String.valueOf(Math.round(price * (1-ratio))));
		
		//VIP 등급
		System.out.println("VIP Member들의 가격에 따른 세일 비율은 " + ratio + "이며, 최종 가격은 " + salePrice + "입니다.");
				
		
		System.out.println("==========================================================");
		System.out.println();
	
	}
}
