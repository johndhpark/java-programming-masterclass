package mypackage;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String studentID, String studentName, String studentDOB, String studentClass) {
        id = studentID;
        name = studentName;
        dateOfBirth = studentDOB;
        classList = studentClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id='" + id + "'" +
                ", name = '" + name + "'" +
                ", dateOfBirth = " + dateOfBirth + "'" +
                ", classList = '" + classList + "'" +
                " }";
    }
}