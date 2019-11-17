package daycare;

public class Student extends Person {
	int grade;

	public Student(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name, int grade) {
		super(age, name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", age=" + age + ", name=" + name + "]";
	}
	
}