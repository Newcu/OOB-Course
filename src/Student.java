
public class Student {
    private String name;
    private int ID;
    private String email;

    public Student() {
        System.out.println("Student created");
    }

    public Student(String name, int ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpNumber() {
        return this.ID;
    }

    public void setpNumber(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
