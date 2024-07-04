import java.util.List;

public class Student extends User{
    String firstName;
    String lastName;
    private List<Course> courses;
    public Student(){}

    public Student(String Firstname,String LastName){
        super();
        this.firstName=Firstname;
        this.lastName=LastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
