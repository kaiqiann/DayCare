package daycare;

public class StudentFactory extends AbstractPersonFactory {
    @Override
    public Person createPerson(String csvline) {
        String[] parts = csvline.split(",");

        Student student = new Student();
        student.setName(parts[1]);
        student.setAge(Integer.parseInt(parts[2]));
        student.setParentName(parts[3]);
        student.setAddress(parts[4]);
        student.setPhoneNumber(parts[5]);

        return student;
    }
}
