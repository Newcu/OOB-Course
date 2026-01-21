


public class Main {
    public static void main(String[] args) {

        Course course = new Course("DA2004", "OOP", 30, 2);

        course.addStudent("John");
        course.addStudent("Jane");

        for (String s : course.showRegisteredStudents()) {
            if (s == null) break;
            System.out.println(s);
        }

    }
}
