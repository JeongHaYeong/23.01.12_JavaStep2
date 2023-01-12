package chapter08;

import java.util.Scanner;


public class Tour {

	public static void main(String[] args) {
	//관광객 등록
	//while문(1,2,3선택시 기능 구현
		
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		System.out.print("관광객 수 : ");
		int z= scan.nextInt();
		
		
		//초기화를 통하여 메모리 확보 및 고객생성 (Guide의 객체
		Guide guide=new Guide(z);

		System.out.println("관광객 등록");
		for(int i=0;i<z;i++) {
			System.out.print((1+i)+". 이름 : ");
			String name=scan.next();
			guide.guest[i].setName(name);
			System.out.print((1+i)+". 성별 : ");
			String gender=scan.next();
			guide.guest[i].setGender(gender);
			//guide.guest[i].setGender(scan.next());
			
		}
		//1,2,3 선택시 구현
		
		outer : while(run) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.println("선택>> ");
			int x=scan.nextInt();
			
			switch (x) {
			case 1:
				for(int i=0;i<z;i++) {
				System.out.println((1+i)+". 이름 : "+guide.guest[i].getName());
				System.out.println((1+i)+". 성별 : "+guide.guest[i].getGender());
				System.out.println((1+i)+". 목적지 : "+guide.guest[i].getPoint());
				System.out.println("----------------");		
				}
				break;
			case 2:
				System.out.print("어디로 변경하시겠습니까 : "); 
				String change=scan.next();
				System.out.println(change+"로 목적지 변경");
				guide.point=change;
				break;
			case 3:
				System.out.println("종료");
				
				//run=false;
				break outer;
			}
			
			
		}
	}

}
