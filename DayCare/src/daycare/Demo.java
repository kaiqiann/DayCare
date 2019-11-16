package daycare;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        StudentDialog dialog = new StudentDialog(null);
        dialog.setTitle("Create a new student");
        dialog.setModal(true);
        dialog.setVisible(true);
        System.out.println(dialog.getStudent());

        Student student = new Student();
        student.setName("Test Name");
        student.setAge(33);
        student.setPhoneNumber("13322445566");
        student.setParentName("Test Parent Name");
        student.setAddress("xxx dd  22d");
        System.out.println(student);

        StudentDialog dialog2 = new StudentDialog(null);
        dialog2.setTitle("Edit a student");
        dialog2.updateView(student);
        dialog2.setModal(true);
        dialog2.setVisible(true);
        System.out.println(student);

        System.exit(0);



    }
}
