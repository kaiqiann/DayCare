Person
Int age
String name

Teacher extends Person
Int credit
List StudentLists //用于老师与学生 多对一关系

AbstractPersonFactory
getObjectall(String fileName)


TeacherFactory extends AbstractPersonFactory
getObjectall(String fileName) //通过文件名 创建文件内所有的对象