package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이재민");
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.getStudentName());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;//10001
		
		System.out.println();
		Student1 studentKim=new Student1();
		studentKim.setStudentName("김창우");
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
		Student1.serialNum++;//10002
		
		System.out.println();
		Student1 studentPark=new Student1();
		studentPark.setStudentName("박창훈");
		System.out.println(studentPark.studentName);
		System.out.println(studentPark.getStudentName());
		Student1.serialNum++;//10003
		

	}

}
