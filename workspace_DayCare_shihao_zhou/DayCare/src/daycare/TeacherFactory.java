package daycare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TeacherFactory extends AbstractPersonFactory {

//	@Override
//	public Person getObject(int age, String name) {
//		return new Teacher(age, name);
//	}

	@Override
	public ArrayList<Person> getObjectall(String fileName) {
		ArrayList<String[]> itemList = new ArrayList<String[]>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/daycare/" + fileName + ".csv"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String item[] = line.split(",");
				itemList.add(item);
			}
			reader.readLine();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("There is(are) " + itemList.size() + " " + fileName + "(s) in your file");
		ArrayList<Person> teachers = new ArrayList<Person>();
		int len = itemList.size();
		int i = 0;
		Teacher obj = null;
		String[] items = null;
		while (i < len) {
			items = itemList.get(i);
			obj = new Teacher(Integer.parseInt(items[0]),items[1],Integer.parseInt(items[2]));
			teachers.add(obj);
			i++;
		}
		System.out.println("Create " + len + " Teacher object(s)......done!");
		return teachers;
	}

}
