
public class CourseWithStudentsAndTeachers {
    public void main() {
        newCourse();
    }

    public void newCourse() {
        Course course = new Course("1IK62", "OOP and Data Structure", 5, 2);

        course.addStudent("Jon");
        course.addStudent("Anita");
        course.addStudent("Britney");
        course.addStudent("Denis");
        course.addStudent("Gresa");

        course.addTeacher("Zenun");
        course.addTeacher("Fisnik");

        System.out.println("List of students registered in the course " + course.getcCode() + " " + course.getcName() + ":");
        for (int i = 0; i < course.showRegisteredStudents().length; i++) {
            if (course.showRegisteredStudents()[i] == null) {
                break;
            }
            System.out.println((i + 1) + "." + course.showRegisteredStudents()[i]);
        }

        System.out.println();


        System.out.println("List of teachers involved in the course " + course.getcCode() + " " + course.getcName() + ":");
        for (int i = 0; i < course.showRegisteredTeachers().length; i++) {
            if (course.showRegisteredTeachers()[i] == null){
                break;
            }
            System.out.println((i + 1) + "." + course.showRegisteredTeachers()[i]);
        }

        System.out.println();

        course.dropStudent("Anita");

        System.out.println("List of remaining students in the course " + course.getcCode() + " " + course.getcName() + "after removing a student:");
        for (int i = 0; i < course.showRegisteredStudents().length; i++) {
            if (course.showRegisteredStudents()[i] != null) {
                System.out.println((i + 1) + "." + course.showRegisteredStudents()[i]);
            }
        }
    }
}
