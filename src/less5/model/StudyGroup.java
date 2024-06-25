package less5.model;


import less5.model.impl.Student;
import less5.model.impl.Teacher;

import java.util.List;



public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return String.format("Учебная Группа: преподаватель = %s, студенты = %s", teacher, students);
    }
}
