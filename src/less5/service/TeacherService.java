package less5.service;

import less5.model.DB.DataBase;
import less5.model.impl.Teacher;

public class TeacherService {
    public Teacher getById(int id) {
        return DataBase.teachersDB
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
