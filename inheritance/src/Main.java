import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // UserManager, StudentManager, InstructorManager nesneleri oluşturuluyor
        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        Student student1 = new Student("Mehmet", "Yılmaz");
        student1.setId("S1");
        student1.setEmail("mhmtylmaz2011@hotmail.com");
        student1.setCourses(new ArrayList<>());

        Student student2 = new Student("Jale", "Soylu");
        student2.setId("S2");
        student2.setEmail("jale.soylu@gmail.com");
        student2.setCourses(new ArrayList<>());

        // Eğitmenler oluşturuluyor
        Instructor instructor1 = new Instructor("Emine", "Çakmak");
        instructor1.setId("I1");
        instructor1.setEmail("emine.cakmak@hotmail.com");
        instructor1.setProfession("Data Science");
        instructor1.setCourses(new ArrayList<>());

        Instructor instructor2 = new Instructor("Murat", "Boyraz");
        instructor2.setId("I2");
        instructor2.setEmail("muratboyraz@gmail.com");
        instructor2.setProfession("algorithms");
        instructor2.setCourses(new ArrayList<>());

        // Öğrenciler ve eğitmenler yönetici sınıflarına ekleniyor
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        instructorManager.addInstructor(instructor1);
        instructorManager.addInstructor(instructor2);

        // Dersler oluşturuluyor
        Course dataAnalysis = new Course("data analysis");
        Course dataStructures = new Course("data structures");
        Course agileSoftware = new Course("agile software");

        // Öğrencilere dersler atanıyor
        studentManager.assignCourseToStudent("S1", dataAnalysis);
        studentManager.assignCourseToStudent("S1", dataStructures);
        studentManager.assignCourseToStudent("S2", agileSoftware);

        // Eğitmenlere dersler atanıyor
        instructorManager.assignCourseToInstructor("I1", dataAnalysis);
        instructorManager.assignCourseToInstructor("I2", dataStructures);

        // Öğrenci ve eğitmen bilgileri yazdırılıyor
        System.out.println("All Students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Courses:");
            for (Course course : student.getCourses()) {
                System.out.println(" - " + course.getCourseName());
            }


        }
        System.out.println("\nAll Instructors:");
        for (Instructor instructor : instructorManager.getAllInstructors()) {
            System.out.println("ID: " + instructor.getId() + ", Name: " + instructor.getFirstName() + " " + instructor.getLastName() + ", Profession: " + instructor.getProfession());
            System.out.println("Courses:");
            for (Course course : instructor.getCourses()) {
                System.out.println(" - " + course.getCourseName());
            }
        }
    }
}