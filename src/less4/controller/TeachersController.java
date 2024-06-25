package less4.controller;

import less4.model.Teacher;
import less4.service.TeachersService;

public class TeachersController implements GroupController<Teacher> {
    private TeachersService teachers;

    public TeachersController(TeachersService teachers) {
        this.teachers = teachers;
    }

    @Override
    public void add(Teacher teacher) {
        teachers.addTeacher(teacher);
    }

    @Override
    public void update(int index, Teacher teacher) {
        if (index >= 0 && index < teachers.getTeachers().size()) {
            teachers.getTeachers().set(index, teacher);
        }
    }
}