package daycare;

import java.util.ArrayList;

public abstract class AbstractPersonFactory {
	/**
	 * Return an AbstractPersonFactory object from CSV files
	 */
//	public abstract Person getObject(int age, String name);

	public abstract ArrayList<Person> getObjectall(String fileName);
}
