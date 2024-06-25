package less4.controller;

import less4.model.Student;
import less4.view.StudentView;
import less4.view.UserView;

import java.util.List;

public class StudentController implements UserController<Student> {

    private UserView<Student> view = new StudentView();



    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }


    @Override
    public Student create(Student student) {
        return new Student(student.getId(), student.getName(), student.getLastName());
    }


}