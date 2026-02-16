
import java.util.Scanner;

public class StudyProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course2[] courses = new Course2[10];
        int numberOfCourses = 0;

        boolean running = true;
        while (running) {
            System.out.println("Study Programme");
            System.out.println("===============");
            System.out.println("1. Display courses and the registered students");
            System.out.println("2. Create a course");
            System.out.println("3. Exit");
            System.out.print("Choose one option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (numberOfCourses == 0) {
                        System.out.println("No course is established yet.");
                    }
                    for (int c = 0; c < numberOfCourses; c++) {
                        Course2 course = courses[c];
                        System.out.println("Course code: " + course.getcCode());
                        System.out.println("Course name: " + course.getcName());

                        Student[] students = course.showRegisteredStudents();
                        int count = 1;
                        for (int i = 0; i < students.length; i++) {
                            if (students[i] != null) {
                                System.out.println(count + ": " + students[i].getpNumber() + " " + students[i].getName() + " " + students[i].getEmail());
                                count++;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter course code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter course name: ");
                    String name = scanner.nextLine();
                    System.out.println("Number of students to be enrolled: ");
                    int maxStudents = scanner.nextInt();
                    scanner.nextLine();

                    courses[numberOfCourses] = new Course2(code, name, maxStudents, 2);

                    System.out.print("Do you want to add a student? (y/n)");
                    char answer = scanner.next().charAt(0);
                    scanner.nextLine();

                    if (answer == 'y' || answer == 'Y') {
                        System.out.println("Add student(s), quit with \"stop\"\n");
                        while (true) {
                            System.out.println("Enter student's name: ");
                            String studentName = scanner.nextLine();
                            if (studentName.equals("stop")) {
                                break;
                            }
                            System.out.print("Id: ");
                            int studentID = scanner.nextInt();
                            scanner.nextLine(); // consume newline
                            System.out.print("E-mail: ");
                            String studentEmail = scanner.nextLine();

                            courses[numberOfCourses].addStudent(studentName, studentID, studentEmail);
                        }
                    }

                    numberOfCourses++;
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
