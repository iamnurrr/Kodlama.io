    import java.util.ArrayList;
import java.util.List;

    public class InstructorManager extends UserManager {

        public void addInstructor(Instructor instructor) {
            addUser(instructor);
        }

        public Instructor getInstructor(String id) {
            for (User user : users) {
                if (user instanceof Instructor && user.getId().equals(id)) {
                    return (Instructor) user;
                }
            }
            return null; // Eğitmen bulunamadı
        }

        public void removeInstructor(String id) {
            users.removeIf(user -> user instanceof Instructor && user.getId().equals(id));
        }


        public void assignCourseToInstructor(String instructorId, Course course) {
            Instructor instructor = getInstructor(instructorId);
            if (instructor != null) {
                instructor.addCourse(course);
            }
        }
        public List<Instructor> getAllInstructors() {
            List<Instructor> instructors = new ArrayList<>();
            for (User user : users) {
                if (user instanceof Instructor) {
                    instructors.add((Instructor) user);
                }
            }
            return instructors;
        }
}
