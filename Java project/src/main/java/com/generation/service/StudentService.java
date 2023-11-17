package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent(String studentId)
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        //TODO implement
        for (Student student: students.values())
        {
            System.out.println(student.getApprovedCourses());
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }
    public void showApprovedCourses(String studentId) {
        if (students.containsKey(studentId)) {
            Student student = students.get(studentId);
            List<Course> courses = new ArrayList<>();
            courses =  student.getApprovedCourses();
            courses.forEach((course) -> System.out.println(course));
        }
    }


}
