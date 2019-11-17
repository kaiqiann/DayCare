package daycare;

import java.util.*;

public class Teacher extends Person {
	int credits;

	public List<Student> StudentLsits = new ArrayList<Student>();

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Teacher(int age, String name) {
		super(age, name);
	}

	public Teacher(int age, String name, int credits) {
		super(age, name);
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Teacher [credits=" + credits + ", age=" + age + ", name=" + name
				+ "]";
	}

}