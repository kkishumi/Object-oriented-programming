package less4.controller;

import less4.model.Teacher;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private UserView<Teacher> teacherView = new TeacherView();

    public void sendOnConsole(List<Teacher> teachers) {
        teacherView.sendOnConsole(teachers);
    }

    @Override
    public Teacher create(Teacher teacher) {
        return new Teacher(teacher.getId(), teacher.getName(), teacher.getLastName());
    }

}