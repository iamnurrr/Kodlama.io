import java.util.ArrayList;
import java.util.List;

public class StudentManager extends UserManager {

    public void addStudent(Student student) {
        addUser(student);
    }

    public Student getStudent(String id) {
        for (User user : users) {
            if (user instanceof Student && user.getId().equals(id)) {
                return (Student) user;
            }
        }
        return null; // Öğrenci bulunamadı
    }

    public void removeStudent(String id) {
        users.removeIf(user -> user instanceof Student && user.getId().equals(id));
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    public void assignCourseToStudent(String studentId, Course course) {
        Student student = getStudent(studentId);
        if (student != null) {
            student.addCourse(course);
        }
    }

    // Yeni metot: Öğrencinin derslerini güncelleme
    public void updateStudentCourses(String studentId, List<Course> courses) {
        Student student = getStudent(studentId);
        if (student != null) {
            student.setCourses(courses);
        }
    }
}
