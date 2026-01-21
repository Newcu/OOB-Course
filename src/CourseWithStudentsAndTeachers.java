import javax.xml.transform.Source;

public class CourseWithStudentsAndTeachers {
    public void Main() {
        newCourse();
    }

    public void newCourse() {
        Course course = new Course("1IK62", "OOP and Data Structure", 30, 2);

        course.addStudent("Jon");
        course.addStudent("Anita");
        course.addStudent("Britney");
        course.addStudent("Denis");
        course.addStudent("Gresa");

        course.addTeacher("Zenun");
        course.addTeacher("Fisnik");

        System.out.println("List of students registered in the course " + course.getcCode() + " " + course.getcName() + ":");

        for (int i = 0; i < course.showRegisteredStudents().length; i++) {
            System.out.println(course.showRegisteredStudents()[i]);
        }


        System.out.println();


    }
}
