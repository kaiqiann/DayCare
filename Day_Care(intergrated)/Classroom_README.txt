Class Classroom added;
Attribute:
  int capacity;
	Vector<Teacher> teachers = new Vector<Teacher>(3);
	Vector<Student> students = new Vector<Student>(30);
Methods:
  int getCapacity();
  void setCredits(int credits);
  void AddStudent(Student s);
  void AddTeacher(Teacher t);
  void Show();

Class Classroom factory added;
  Lazy Singleton Factory Pattern;
Methods:
  ClassroomFactory getInstance();
  Classroom getObject();
  Classroom getObject(int capacity, Vector<Teacher> teachers, Vector<Student> students);
  
 Class Driver added;
  Some samples;
  
 Class Person modified;
  ToString added;
  
 Class Student modified;
  ToString added;
 Attribute:
  int grade;
 Methods:
  int getGrade();
  void setGrade(int grade);
  
 Class Teacher modified;
  ToString added;
