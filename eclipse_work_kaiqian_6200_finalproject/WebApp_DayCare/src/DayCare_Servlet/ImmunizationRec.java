package DayCare_Servlet;

import java.util.Hashtable;
import java.util.Set;


public class ImmunizationRec {
	private int age;
	private static Hashtable<String,Integer> ImmuRecPre;
	private static Hashtable<String,Integer> ImmuRecKin;
	private static Hashtable<String,Integer> ImmuRecGra;
	private static Hashtable<String,Integer> ImmuRecCol;
	
	public static void initializetable() {
		//ImmuRec Preschool
		ImmuRecPre = new Hashtable<String, Integer>();
		ImmuRecPre.put("Hib", 4);
		ImmuRecPre.put("DTap", 4);
		ImmuRecPre.put("Polio", 3);
		ImmuRecPre.put("Hepatitis B", 3);
		ImmuRecPre.put("MMR", 1);
		ImmuRecPre.put("Varicella", 1);
		//ImmuRec Kindergarden
		ImmuRecKin = new Hashtable<String, Integer>();
		ImmuRecKin.put("DTap", 5);
		ImmuRecKin.put("Polio", 4);
		ImmuRecKin.put("Hepatitis B", 3);
		ImmuRecKin.put("MMR", 2);
		ImmuRecKin.put("Varicella", 2);
		//ImmuRec Grades
		ImmuRecGra = new Hashtable<String, Integer>();
		ImmuRecGra.put("Tdap", 1);
		ImmuRecGra.put("Polio", 4);
		ImmuRecGra.put("Hepatitis B", 3);
		ImmuRecGra.put("MMR", 2);
		ImmuRecGra.put("Varicella", 2);
		ImmuRecGra.put("Meningococcal", 1);
		//ImmuRec Grades
		ImmuRecCol = new Hashtable<String, Integer>();
		ImmuRecCol.put("Tdap", 1);
		ImmuRecGra.put("Hepatitis B", 3);
		ImmuRecGra.put("MMR", 2);
		ImmuRecGra.put("Varicella", 2);
		ImmuRecGra.put("Meningococcal", 1);
	}
	
	
	public ImmunizationRec(int age) {
		super();
		this.age = age;
	}
	
	public boolean Overdue(int age, Hashtable<String,Integer> student) {
		if(age <5) {
			if(student.equals(ImmuRecPre)) {
				return false;
			}
		}else if(age>=5 && age <12) {
			if(student.equals(ImmuRecKin)) {
				return false;
			}
		}else if(age>12 && age <19) {
			if(student.equals(ImmuRecGra)) {
				return false;
			}
		}else {
			if(student.equals(ImmuRecCol)) {
				return false;
			}
		}
		return true;
	}
	
    
    public void updateImmuRec(String csv) {
    	String[] temp = csv.split(",");
    	int value;
		try {
			value = Integer.valueOf(temp[1]);
	    	immurec.put(temp[1], value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
