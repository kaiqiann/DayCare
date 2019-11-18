package version_without_rules;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TeacherFactory extends AbstractPersonFactory {

	/*@Override
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
	}*/

	
	
	//csvstring format "name,age,credit"
	@Override
	public Teacher createPerson(String csvline) {
		// TODO Auto-generated method stub
		String[] temp = csvline.split(",");
		Teacher teacher = new Teacher();
		teacher.setName(temp[0]);
		try {
			teacher.setAge(Integer.parseInt(temp[1]));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			teacher.setCredits(Integer.parseInt(temp[2]));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
	}

}
