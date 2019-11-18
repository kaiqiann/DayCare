package version_without_rules;

import java.util.ArrayList;
import java.util.List;

public class DemoforTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TeacherFactory factory = new TeacherFactory();
		ArrayList<Person> lists = factory.getObjectall("Teacher");
		Teacher kk = (Teacher) lists.get(0);
		System.out.println(kk.credits);
		System.out.println(lists.get(1).age);
		System.out.println(lists.get(2).age);
		System.out.println(lists.get(3).age);
		
		Student a = new Student(1, "adssad");
		Student b = new Student(2, "adssad");
		kk.StudentLsits.add(a);
		kk.StudentLsits.add(b);
		System.out.println(kk.StudentLsits.get(0).age);
		System.out.println(kk.StudentLsits.get(1).age);
		*/
		
		TeacherFactory factory = new TeacherFactory();
		ArrayList<Person> lists = new ArrayList();
		lists.add(factory.createPerson("David,23,21"));
		List<Person> students = factory.createPersonFromCsv("Teacher.csv");
		System.out.println(students);

	}

}
