package less5.controller;

import less5.model.StudyGroup;
import less5.model.impl.Student;
import less5.model.impl.Teacher;

import less5.service.StudentService;
import less5.service.StudyGroupService;
import less5.service.TeacherService;

import java.util.List;


public class StudyGroupController {
    private StudentService studentService = new StudentService();
    private TeacherService teacherService = new TeacherService();
    private StudyGroupService groupService = new StudyGroupService();

    public StudyGroup createGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getById(teacherId);
        List<Student> students = studentService.getByIds(studentIds);
        return groupService.createGroup(teacher, students);
    }
}