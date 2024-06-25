package less5.service;

import less5.model.StudyGroup;
import less5.model.impl.Student;
import less5.model.impl.Teacher;

import java.util.List;


public class StudyGroupService {
    public StudyGroup createGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
