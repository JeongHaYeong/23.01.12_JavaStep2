package chapter08;

import java.util.Scanner;

public class Guide {

	//Guest g=new Guest();
	
	static String point;
	Guest[] guest;

	Guest g=new Guest();
	// 생성자 초기화	
	public Guide(int n) {
		point = "발리";//목적지
		guest = new Guest[n];


		// 객체 생성
		for (int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
			
			
			/*
	 		g.setName("홍길동");
			System.out.println("1. 이름 : "+g.getName());
			g.setGender("남");
			System.out.println("1. 성별 : "+g.getGender());
			*/
		}		

	}

}
