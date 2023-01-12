package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		
		student2 studentLee=new student2();
		studentLee.setStudentName("이재민");
		System.out.println("이름 : "+studentLee.studentName
									+" | 아이디 : "+studentLee.studentID);
		
		System.out.println();
		student2 studentKim=new student2();
		studentKim.setStudentName("김창우");
		System.out.println("이름 : "+studentKim.studentName
									+" | 아이디 : "+studentKim.studentID);
		
		System.out.println();
		student2 studentPark=new student2();
		studentPark.setStudentName("박창훈");
		System.out.println("이름 : "+studentPark.studentName
									+" | 아이디 : "+studentPark.studentID);
		

	}

}
