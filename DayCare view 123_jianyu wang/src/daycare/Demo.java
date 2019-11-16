package daycare;

import javax.swing.*;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StudentDialog dialog = new StudentDialog(null);
        dialog.setTitle("Create a new student");
        dialog.setModal(true);
        dialog.setVisible(true);
        System.out.println(dialog.getStudent());


        StudentFactory studentFactory = new StudentFactory();
        List<Person> students = studentFactory.createPersonFromCsv("students.csv");
        for(Person person: students) {
            Student curstudent = (Student) person;

            StudentDialog dialog3 = new StudentDialog(null);
            dialog3.setTitle("Edit a student");
            dialog3.updateView(curstudent);
            dialog3.setModal(true);
            dialog3.setVisible(true);
            System.out.println(curstudent);

        }



        System.exit(0);



    }
}
