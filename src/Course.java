
public class Course {

    private String cCode;
    private String cName;
    private String[] students;
    private int maxNumOfStudents;
    private int numOfRegisteredStudents;
    private String[] teachers;
    private int maxNumOfTeachers;
    private int numOfRegisteredTeachers;

    public Course() {
        System.out.println("Course created");
    }

    public Course (String cCode, String cName, int maxNumOfStudents, int maxNumOfTeachers) {
        this.cCode = cCode;
        this.cName = cName;
        this.maxNumOfStudents = maxNumOfStudents;
        this.maxNumOfTeachers = maxNumOfTeachers;
        this.students = new String[maxNumOfStudents];
        this.teachers = new String[maxNumOfTeachers];
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode){
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName){
        this.cName = cName;
    }

    public void addStudent(String student){
        for (int i = 0; i < student.length(); i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        System.out.println("Course is full");
    }

    public void addTeacher(String teacher){
        for (int i = 0; i < teacher.length(); i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return;
            }
        }
    }

    public void dropStudent(String student){
        int counter = 0;
        for(String s : students) {
            counter++;
            if (s.equals(student)) {
                students[counter] = null;
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void dropTeacher(String teacher){
        int counter = 0;
        for(String t : teachers) {
            counter++;
            if (t.equals(teacher)) {
                students[counter] = null;
                return;
            }
        }
        System.out.println("Teacher not found");
    }

    public String[] showRegisteredStudents(){
        return students;
    }

    public String[] showRegisteredTeachers(){
        return teachers;
    }
}
