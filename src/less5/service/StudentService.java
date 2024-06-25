package less5.service;


import less5.model.DB.DataBase;
import less5.model.impl.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    public Student createStudent(String name, String lastName, int idgroup) {

        int id;
        int size = DataBase.studentsDB.size();

        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(id, name, lastName, idgroup);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DataBase.studentsDB
                .stream()

                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null) {
            throw new Exception("Студент не найден");

        }
        return student;
    }

    public List<Student> getByIds(List<Integer> ids) {
        return DataBase.studentsDB
                .stream()
                .filter(s -> ids.contains(s.getId()))
                .collect(Collectors.toList());
    }

    public List<Student> getAllStudents() {
        return DataBase.studentsDB;
    }
}
