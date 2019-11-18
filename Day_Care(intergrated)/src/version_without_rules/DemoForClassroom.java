package version_without_rules;

import java.util.Vector;


public class DemoForClassroom {
		public static void main(String[] args) {
			ClassroomFactory factory = ClassroomFactory.getInstance();
			
			Classroom first = factory.getObject();
			
			Teacher a = new Teacher(73, "Sam", 4);
			Teacher b = new Teacher(34, "Tom", 5);
			Teacher c = new Teacher(23, "Peter", 9);
//			Student A = new Student(11, "A", 99);
//			Student B = new Student(11, "B", 100);
			
			Vector<Teacher> teachers = new Vector<Teacher>(3);
			teachers.add(a);
			teachers.add(b);
			teachers.add(c);
			
			Vector<Student> students = new Vector<Student>(30);
//			students.add(A);
//			students.add(B);
			
			first.AddTeacher(a);
			first.AddTeacher(b);
			first.AddTeacher(c);
//			first.AddStudent(A);
//			first.AddStudent(B);
			first.Show();
			System.out.println("Capacity: " + first.getCapacity());
			first.setCredits(8);
			first.Show();
			
			Classroom second = factory.getObject(28, teachers, students);
			second.Show();
			System.out.println("Capacity: " + second.getCapacity());
			second.setCredits(10);
			second.Show();
		}

}
