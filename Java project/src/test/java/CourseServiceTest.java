import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseServiceTest {

    public CourseService courseService;

    @BeforeEach
    public void setUp() {
        courseService = new CourseService();
    }

    @Test
    public void testRegisterCourse() {
        Course newCourse = new Course("TEST-COURSE-1", "Test Course", 6, new Module("cs_1", "compsci", "intro"));
        courseService.registerCourse(newCourse);

        assertNotNull(courseService.getCourse("TEST-COURSE-1"));
    }


    /*
    @Test
    public void testShowEnrolledStudents() {
        Course course = new Course("TEST-COURSE-3", "Test Course 3", 6, new Module("TEST", "Test Module", "Test description"));
        Student student1 = new Student("1", "Alice Smith","alice.smith@example.com", Date new Date());
        Student student2 = new Student("2","Bob Johnson", "bob.johnson@example.com", Date );

        courseService.registerCourse(course);
        courseService.enrollStudent("TEST-COURSE-3", student1);
        courseService.enrollStudent("TEST-COURSE-3", student2);

        courseService.showEnrolledStudents("TEST-COURSE-3"); // This will print to console, so manually verify

        // You can also capture the output and assert it using assertions
    }


     */
    @Test
    public void testShowSummary() {
        // Assuming there are some predefined courses and students in the CourseService constructor

        courseService.showSummary(); // This will print to console, so manually verify

        // You can also capture the output and assert it using assertions
    }
}