
public class CourseWithStudentsAndTeachers2 {
    public void main() {
        newCourse();
    }

    public void newCourse() {
        Course2 course2 = new Course2("1IK62", "OOP and Data Structure", 5, 2);

        course2.addStudent("Jon", 1, "john.doe@gmail.com");
        System.out.println(course2.showRegisteredStudents());

        System.out.println("List of students registered in the course " + course2.getcCode() + " " + course2.getcName() + ":");
        for (int i = 0; i < course2.showRegisteredStudents().length; i++) {
            if (course2.showRegisteredStudents()[i] == null) {
                break;
            }
            System.out.println((i + 1) + "." + course2.showRegisteredStudents()[i]);
        }

        System.out.println();


        System.out.println("List of teachers involved in the course " + course2.getcCode() + " " + course2.getcName() + ":");
        for (int i = 0; i < course2.showRegisteredTeachers().length; i++) {
            if (course2.showRegisteredTeachers()[i] == null){
                break;
            }
            System.out.println((i + 1) + "." + course2.showRegisteredTeachers()[i]);
        }

        System.out.println();

        course2.dropStudent("Anita");

        System.out.println("List of remaining students in the course " + course2.getcCode() + " " + course2.getcName() + "after removing a student:");
        for (int i = 0; i < course2.showRegisteredStudents().length; i++) {
            if (course2.showRegisteredStudents()[i] != null) {
                System.out.println((i + 1) + "." + course2.showRegisteredStudents()[i]);
            }
        }
    }
}
