import java.util.jar.JarOutputStream;

public class CourseWithStudentsAndTeachers2 {
    public void main() {
        newCourse();
    }

    public void newCourse() {
        Course2 course2 = new Course2("1IK62", "OOP and Data Structure", 5, 2);

        course2.addStudent("Jon Doe", 12345, "john.doe@gmail.com");
        course2.addStudent("Anita Hej", 56734, "anita.hej@gmail.com");
        course2.addStudent("Barbara Doe", 54321, "barbara.doe@gmail.com");
        course2.addStudent("Amanda Hej", 36734, "ahej@gmail.com");
        course2.addStudent("Denis Doe", 12341, "ddoe@gmail.com");

        course2.addTeacher("Zenun Kastrati", "Course responsible", "zenun.kastrati@lnu.se");
        course2.addTeacher("Fisnik Dalipi", "Examinator", "fisnik.dalipi@lnu.se");


        System.out.println("List of students registered in the course " + course2.getcCode() + " " + course2.getcName() + ":");
        System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "ID", "E-mail");
        for (int i = 0; i < course2.showRegisteredStudents().length; i++) {
            Student s = course2.showRegisteredStudents()[i];
            if (s == null) {
                break;
            }
            System.out.printf("%-4d %-18s %-20s %-30s%n" , i + 1, s.getName(), s.getpNumber(), s.getEmail());
        }

        System.out.println();

        System.out.println("List of teachers involved in the course " + course2.getcCode() + " " + course2.getcName() + ":");
        System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "Role", "E-mail");
        for (int i = 0; i < course2.showRegisteredTeachers().length; i++) {
            Teacher t = course2.showRegisteredTeachers()[i];
            if (t == null) {
                break;
            }
            System.out.printf("%-4d %-18s %-20s %-30s%n", i + 1, t.getName(), t.getpNumber(), t.getEmail());
        }

        System.out.println();

        course2.dropStudent(12341);

        System.out.println("List of remaining students in the course " + course2.getcCode() + " " + course2.getcName() + "after removing a student:");
        System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "ID", "E-mail");
        for (int i = 0; i < course2.showRegisteredStudents().length; i++) {
            Student s = course2.showRegisteredStudents()[i];
            if (s == null) {
                break;
            }
            System.out.printf("%-4d %-18s %-20s %-30s%n" , i + 1, s.getName(), s.getpNumber(), s.getEmail());
        }
    }
}
