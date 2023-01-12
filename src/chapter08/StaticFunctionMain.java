package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction a=new StaticFunction();
		System.out.println(a.str2);
		String s=a.getStatic();
		System.out.println(s);
		
		
		//static 메서드는 클래스명으로 접근이 가능
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
				

	}

}
