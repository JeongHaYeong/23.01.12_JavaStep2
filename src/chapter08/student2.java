package chapter08;

public class student2 {
	
	public static int  serialNum=10000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public student2() {
		//후위연산
		serialNum++;
		this.studentID=serialNum;
		//전위연산
		//studentID = ++serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getSerialNum() {
		return serialNum;
	}
}
