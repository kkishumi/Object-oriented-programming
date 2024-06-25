package less5.controller;

import java.util.List;

import less5.model.impl.Student;
import less5.service.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent(String name, String lastName, int idgroup) {
        return service.createStudent(name, lastName, idgroup);

    }

    public Student getById(int id) {

        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}