package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

public class Daycare_rule {
	
	private int TeacherNum = 0;  // the total number of teacher
	private int StudentNum = 0;  // the total number of student
	private int GroupSize = 0;	 // the ratio rate of student and teacher
	private int GroupNumMax = 0; // the max number of group in a class
	private int ClassNum;        // suppose there are six classes, which is from 1 to 6 
	
	private int temNum1 = 1;
	private int temNum2 = 1;
	private int temNum3 = 1;
	private int temNum4 = 1;
	private int temNum5 = 1;
	private int temNum6 = 1;
	
	//student number in different class
	private int StudentNum1 = 0;
	private int StudentNum2 = 0;
	private int StudentNum3 = 0;
	private int StudentNum4 = 0;
	private int StudentNum5 = 0;
	private int StudentNum6 = 0;
	
	
	private List TeacherList = new ArrayList<>();  // the list of teachers
	private List ClassList = new ArrayList<>();		// the list of whole classes

	// teacher list in different class
	private List Teacher1 = new ArrayList<>();
	private List Teacher2 = new ArrayList<>();
	private List Teacher3 = new ArrayList<>();
	private List Teacher4 = new ArrayList<>();
	private List Teacher5 = new ArrayList<>();
	private List Teacher6 = new ArrayList<>();
	
	// the list of different class
	private List Class1 = new ArrayList<>();
	private List Class2 = new ArrayList<>();
	private List Class3 = new ArrayList<>();
	private List Class4 = new ArrayList<>();
	private List Class5 = new ArrayList<>();
	private List Class6 = new ArrayList<>();
	
	public Daycare_rule() {
		// TODO Auto-generated constructor stub
	}

	public int getTeacherNum() {
		return TeacherNum;
	}

	public int getGroupSize() {
		return GroupSize;
	}
	public int getGroupNum() {
		return GroupNumMax;
	}

	// show the teacher 
	public void showTeachers() {
		// TODO Auto-generated method stub
		TeacherList.add(Teacher1);
		TeacherList.add(Teacher2);
		TeacherList.add(Teacher3);
		TeacherList.add(Teacher4);
		TeacherList.add(Teacher5);
		TeacherList.add(Teacher6);
		System.out.println(TeacherList);
	}
	
	//show the whole classes 
	public void showClass() {
		// TODO Auto-generated method stub
		ClassList.add(Class1);
		ClassList.add(Class2);
		ClassList.add(Class3);
		ClassList.add(Class4);
		ClassList.add(Class5);
		ClassList.add(Class6);
		System.out.println(ClassList);
		
	}
	
	//show different class
	public void showClass1() {
		// TODO Auto-generated method stub
		System.out.println(Class1);
	}
	
	public void showClass2() {
		// TODO Auto-generated method stub
		System.out.println(Class2);
	}
	
	public void showClass3() {
		// TODO Auto-generated method stub
		System.out.println(Class3);
	}
	public void showClass4() {
		// TODO Auto-generated method stub
		System.out.println(Class4);
	}
	
	public void showClass5() {
		// TODO Auto-generated method stub
		System.out.println(Class5);
	}
	
	public void showClass6() {
		// TODO Auto-generated method stub
		System.out.println(Class6);
	}
	
	// get the ratio and the max group number for each student
	public void getSizeRatio(Student student) {
		
		// groupMaxNum
		if( student.getAge() > 5 && student.getAge() < 48)
		{
			this.GroupNumMax = 3;
		}
		else {
			this.GroupNumMax = 2;
		}
		
		// get the class that the student need to go 
		if( student.getAge() > 5 && student.getAge() <=12)
		{
			this.ClassNum = 1;
			this.GroupSize = 4;
		}
		if( student.getAge() > 12 && student.getAge() <= 24)
		{
			this.ClassNum = 2;
			this.GroupSize = 5;
		}
		if( student.getAge() > 24 && student.getAge() <= 35)
		{
			this.ClassNum = 3;
			this.GroupSize = 6;
		}
		if( student.getAge() > 35 && student.getAge() <= 47)
		{
			this.ClassNum = 4;
			this.GroupSize = 8;
		}
		if( student.getAge() > 47 && student.getAge() <= 59)
		{
			this.ClassNum = 5;
			this.GroupSize = 12;
		}
		if( student.getAge() > 59 )
		{
			this.ClassNum = 6;
			this.GroupSize = 15;
		}

	}
	
	// add each teacher to class
	public void addTeacherToClass(Teacher teacher) {
		
		//get the name of teacher
		List tem1 = new ArrayList<>();
		tem1.add(teacher.getTeacherName());
		String str = tem1.toString();
		this.TeacherNum = TeacherNum + 1;
		// add teacher to each classroom
		if( TeacherNum < 4 ) {
			Class1.add(tem1);
			Teacher1.add(str);
		}
		if( TeacherNum >= 4 && TeacherNum < 7  ) {
			Class2.add(tem1);
			Teacher2.add(str);
		}
		if( TeacherNum >= 7 && TeacherNum < 10  ) {
			Class3.add(tem1);
			Teacher3.add(str);
		}
		if( TeacherNum >= 10 && TeacherNum < 13  ) {
			Class4.add(tem1);
			Teacher4.add(str);
		}
		if( TeacherNum >= 13 && TeacherNum < 15  ) {
			Class5.add(tem1);
			Teacher5.add(str);
		}
		if( TeacherNum >= 15 && TeacherNum < 17  ) {
			Class6.add(tem1);
			Teacher6.add(str);
		}
		if( TeacherNum >= 17  ) {
			System.out.println("the classroom is full");
		}
	}
	
	
	// add each student to class
	public void addStudent(Student student) {
		
		//get the name and age of the student
		List tem = new ArrayList<>();
		tem.add(student.getAge());
		tem.add(student.getName());
			
		StudentNum = StudentNum + 1;
		
		//send student to teacher in each class 
		//for class 1 whose age is between 6-12
		if( ClassNum == 1 ) {
			
			StudentNum1 = StudentNum1 + 1;
			
			if( StudentNum1 > GroupSize * GroupNumMax) {
				System.out.println("Classroom is full");
				temNum1 = 0;
				StudentNum1 = StudentNum1 - 1;
				StudentNum = StudentNum - 1;
			}
			else {
				if(StudentNum1 <= GroupSize * temNum1 && StudentNum1 > GroupSize * (temNum1 -1)) {
					List temteacher = new ArrayList<>();
					temteacher = (List) Class1.get(temNum1 - 1);
					temteacher.add(tem);
					Class1.set(temNum1-1,temteacher);		
				}
			
				if( StudentNum1 % GroupSize ==0) {
					temNum1 = temNum1 + 1;
				}
			}
		}
		
		//for class 2 whose age is between 13-24
				if( ClassNum == 2 ) {
					
					StudentNum2 = StudentNum2 + 1;
					
					if( StudentNum2 > GroupSize * GroupNumMax) {
						System.out.println("Classroom is full");
						temNum2 = 0;
						StudentNum2 = StudentNum2 - 1;
						StudentNum = StudentNum - 1;
					}
					else {
						if(StudentNum2 <= GroupSize * temNum2 && StudentNum2 > GroupSize * (temNum2 -1)) {
							List temteacher = new ArrayList<>();
							temteacher = (List) Class2.get(temNum2 - 1);
							temteacher.add(tem);
							Class2.set(temNum2-1,temteacher);		
						}
					
						if( StudentNum2 % GroupSize ==0) {
							temNum2 = temNum2 + 1;
						}
					}
				}
				
			//for class 3 whose age is between 25-35
				if( ClassNum == 3 ) {
					
					StudentNum3 = StudentNum3 + 1;
					
					if( StudentNum3 > GroupSize * GroupNumMax) {
						System.out.println("Classroom is full");
						temNum3 = 0;
						StudentNum3 = StudentNum3 - 1;
						StudentNum = StudentNum - 1;
					}
					else {
						if(StudentNum3 <= GroupSize * temNum3 && StudentNum3 > GroupSize * (temNum3 -1)) {
							List temteacher = new ArrayList<>();
							temteacher = (List) Class3.get(temNum3 - 1);
							temteacher.add(tem);
							Class3.set(temNum3-1,temteacher);		
						}
					
						if( StudentNum3 % GroupSize ==0) {
							temNum3 = temNum3 + 1;
						}
					}
				}
				
				//for class 4 whose age is between 36-47
				if( ClassNum == 4 ) {
					
					StudentNum4 = StudentNum4 + 1;
					
					if( StudentNum4 > GroupSize * GroupNumMax) {
						System.out.println("Classroom is full");
						temNum4 = 0;
						StudentNum4 = StudentNum4 - 1;
						StudentNum = StudentNum - 1;
					}
					else {
						if(StudentNum4 <= GroupSize * temNum4 && StudentNum4 > GroupSize * (temNum4 -1)) {
							List temteacher = new ArrayList<>();
							temteacher = (List) Class4.get(temNum4 - 1);
							temteacher.add(tem);
							Class4.set(temNum4-1,temteacher);		
						}
					
						if( StudentNum4 % GroupSize ==0) {
							temNum4 = temNum4 + 1;
						}
					}
				}
				
				//for class 4 whose age is between 48-59
				if( ClassNum == 5 ) {
					
					StudentNum5 = StudentNum5 + 1;
					
					if( StudentNum5 > GroupSize * GroupNumMax) {
						System.out.println("Classroom is full");
						temNum5 = 0;
						StudentNum5 = StudentNum5 - 1;
						StudentNum = StudentNum - 1;
					}
					else {
						if(StudentNum5 <= GroupSize * temNum5 && StudentNum5 > GroupSize * (temNum5 -1)) {
							List temteacher = new ArrayList<>();
							temteacher = (List) Class5.get(temNum5 - 1);
							temteacher.add(tem);
							Class5.set(temNum5-1,temteacher);		
						}
					
						if( StudentNum5 % GroupSize ==0) {
							temNum5 = temNum5 + 1;
						}
					}
				}
				
				//for class 4 whose age above 60
				if( ClassNum == 6 ) {
					
					StudentNum6 = StudentNum6 + 1;
					
					if( StudentNum6 > GroupSize * GroupNumMax) {
						System.out.println("Classroom is full");
						temNum6 = 0;
						StudentNum6 = StudentNum6 - 1;
						StudentNum = StudentNum - 1;
					}
					else {
						if(StudentNum6 <= GroupSize * temNum6 && StudentNum6 > GroupSize * (temNum6 -1)) {
							List temteacher = new ArrayList<>();
							temteacher = (List) Class6.get(temNum6 - 1);
							temteacher.add(tem);
							Class6.set(temNum6-1,temteacher);		
						}
					
						if( StudentNum6 % GroupSize ==0) {
							temNum6 = temNum6 + 1;
						}
					}
				}
	}
	
	
	public static void demo() {
		
		Daycare_rule dayCare = new Daycare_rule();
		/**
		Student student1 = new Student(13, "w1");
		Student student2 = new Student(14, "w2");
		Student student3 = new Student(15, "w3");
		Student student4 = new Student(16, "w4");
		Student student5 = new Student(17, "w5");
		Student student6 = new Student(23, "w6");
		Student student7 = new Student(17, "w7");
		Student student8 = new Student(17, "w8");
		Student student9 = new Student(17, "w9");
		Student student10 = new Student(17, "w10");
		Student student11 = new Student(17, "w11");
		Student student12 = new Student(17, "w12");
		Student student13 = new Student(17, "w13");
		Student student14 = new Student(17, "w14");
		Student student15 = new Student(17, "w15");
		*/
		//我这里的student只有两个参数，teacher只有一个参数，是我自己用来测试的
		Student student1 = new Student(15, "w1");
		Student student2 = new Student(8, "w2");
		Student student3 = new Student(10, "w3");
		Student student4 = new Student(25, "w4");
		Student student5 = new Student(24, "w5");
		Student student6 = new Student(47, "w6");
		Student student7 = new Student(59, "w7");
		Student student8 = new Student(6, "w8");
		Student student9 = new Student(48, "w9");
		Student student10 = new Student(26, "w10");
		Student student11 = new Student(37, "w11");
		Student student12 = new Student(49, "w12");
		Student student13 = new Student(27, "w13");
		Student student14 = new Student(126, "w14");
		Student student15 = new Student(60, "w15");
		Student student16 = new Student(126, "w16"); 
		Student student17 = new Student(26, "w17"); 
		Student student18 = new Student(26, "w18"); 
		Student student19 = new Student(26, "w19"); 
		
		Teacher teacher1 = new Teacher("a");
		Teacher teacher2 = new Teacher("b");
		Teacher teacher3 = new Teacher("c");
		Teacher teacher4 = new Teacher("d");
		Teacher teacher5 = new Teacher("e");
		Teacher teacher6 = new Teacher("f");
		Teacher teacher7 = new Teacher("g");
		Teacher teacher8 = new Teacher("h");
		Teacher teacher9 = new Teacher("i");
		Teacher teacher10 = new Teacher("j");
		Teacher teacher11 = new Teacher("k");
		Teacher teacher12 = new Teacher("l");
		Teacher teacher13 = new Teacher("m");
		Teacher teacher14 = new Teacher("n");
		Teacher teacher15 = new Teacher("o");
		Teacher teacher16 = new Teacher("p");

		dayCare.addTeacherToClass(teacher1);
		dayCare.addTeacherToClass(teacher2);
		dayCare.addTeacherToClass(teacher3);
		dayCare.addTeacherToClass(teacher4);
		dayCare.addTeacherToClass(teacher5);
		dayCare.addTeacherToClass(teacher6);
		dayCare.addTeacherToClass(teacher7);
		dayCare.addTeacherToClass(teacher8);
		dayCare.addTeacherToClass(teacher9);
		dayCare.addTeacherToClass(teacher10);
		dayCare.addTeacherToClass(teacher11);
		dayCare.addTeacherToClass(teacher12);
		dayCare.addTeacherToClass(teacher13);
		dayCare.addTeacherToClass(teacher14);
		dayCare.addTeacherToClass(teacher15);
		dayCare.addTeacherToClass(teacher16);
		
		dayCare.getSizeRatio(student1);
		dayCare.addStudent(student1);
		dayCare.getSizeRatio(student2);
		dayCare.addStudent(student2);
		dayCare.getSizeRatio(student3);
		dayCare.addStudent(student3);
		dayCare.getSizeRatio(student4);
		dayCare.addStudent(student4);
		dayCare.getSizeRatio(student5);
		dayCare.addStudent(student5);
		dayCare.getSizeRatio(student6);
		dayCare.addStudent(student6);
		dayCare.getSizeRatio(student7);
		dayCare.addStudent(student7);
		dayCare.getSizeRatio(student8);
		dayCare.addStudent(student8);
		dayCare.getSizeRatio(student9);
		dayCare.addStudent(student9);
		dayCare.getSizeRatio(student10);
		dayCare.addStudent(student10);
		dayCare.getSizeRatio(student11);
		dayCare.addStudent(student11);
		dayCare.getSizeRatio(student12);
		dayCare.addStudent(student12);
		dayCare.getSizeRatio(student13);
		dayCare.addStudent(student13);
		dayCare.getSizeRatio(student14);
		dayCare.addStudent(student14);
		dayCare.getSizeRatio(student15);
		dayCare.addStudent(student15);
		dayCare.getSizeRatio(student16);
		dayCare.addStudent(student16);
		dayCare.getSizeRatio(student17);
		dayCare.addStudent(student17);
		dayCare.getSizeRatio(student18);
		dayCare.addStudent(student18);
		dayCare.getSizeRatio(student19);
		dayCare.addStudent(student19);
		
		System.out.println("start");
		System.out.println("");
		
		System.out.println("show teachers");
		dayCare.showTeachers();
		System.out.println("");
		
		System.out.println("show class");
		dayCare.showClass();
		System.out.println("");
		
		System.out.println("end");

}
}
