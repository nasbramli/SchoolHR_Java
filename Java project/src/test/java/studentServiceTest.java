import com.generation.model.Student;
import com.generation.service.StudentService;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class studentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    public void testSubscribeStudent(){
        Student student = new Student("101", "MJ", "mj@123", new Date());
        studentService.subscribeStudent(student);

        Student retrivedStudent = studentService.findStudent("101");
        assertNotNull(retrivedStudent);
        assertEquals("MJ", retrivedStudent.getName());
    }

    @Test
    public void testIsSubscribed(){
        Student student = new Student("101", "MJ", "mj@123", new Date());
        studentService.subscribeStudent(student);

        assertTrue(studentService.isSubscribed("101"));
        assertFalse(studentService.isSubscribed("non-existent"));
    }

}