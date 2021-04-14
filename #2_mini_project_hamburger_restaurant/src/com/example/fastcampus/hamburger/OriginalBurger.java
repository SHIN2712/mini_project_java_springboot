package com.example.fastcampus.hamburger;

public class OriginalBurger implements Hamburger {
	private int price = 1000;
	private String ingredient = "Ham";
	
	//To-do 인터페이스에서 만든 메서드를 재정의하여 구현합니다.
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public String getIngredient() {
		return ingredient;
	}
}
