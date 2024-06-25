package less4;

import less4.controller.StudentController;
import less4.controller.StudentGroupController;
import less4.controller.TeacherController;
import less4.controller.TeachersController;
import less4.model.Student;
import less4.model.StudentGroup;
import less4.model.Teacher;
import less4.service.StudentGroupService;
import less4.service.StudentService;
import less4.service.TeacherService;
import less4.service.TeachersService;

import java.util.ArrayList;

public class Lesson4 {

    public static void main(String[] args) {
        // Создание сервиса и контроллера для студентов
        StudentService studentService = new StudentService();
        StudentController studentController = new StudentController();

        // Создание студентов
        Student student1 = studentService.createStudent(1, "Николай", "Иванов");
        Student student2 = studentService.createStudent(2, "Евгения", "Сафина");
        Student student3 = studentService.createStudent(3, "Петр", "Хендрикс");
        Student student4 = studentService.createStudent(4, "Каз", "Бреккер");

        // Создание групп студентов
        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();

        // Добавление студентов в группы
        group1.students = new ArrayList<>();
        group2.students = new ArrayList<>();
        group1.students.add(student1);
        group1.students.add(student2);
        group2.students.add(student3);
        group2.students.add(student4);

        // Вывод студентов на консоль после редактирования
        System.out.println("Список студентов в группе 1:");
        studentController.sendOnConsole(group1.students);
        System.out.println("Список студентов в группе 2:");
        studentController.sendOnConsole(group2.students);

        // Создание сервиса и контроллера для групп студентов
        StudentGroupService studentGroupService1 = new StudentGroupService(group1);
        StudentGroupService studentGroupService2 = new StudentGroupService(group2);
        StudentGroupController groupController1 = new StudentGroupController(studentGroupService1);
        StudentGroupController groupController2 = new StudentGroupController(studentGroupService2);

        // Редактирование студентов
        Student updatedStudent = studentService.createStudent(1, "Николай", "Ланцов");
        groupController1.update(0, updatedStudent);
        Student updatedStudent2 = studentService.createStudent(3, "Вилан", "Сидоров");
        groupController2.update(0, updatedStudent2);

        // Вывод студентов на консоль после редактирования
        System.out.println("Список студентов в группе 1 после редактирования:");
        studentController.sendOnConsole(group1.students);
        System.out.println("Список студентов в группе 2 после редактирования:");
        studentController.sendOnConsole(group2.students);

        // Создание сервиса и контроллера для учителей
        TeacherService teacherService = new TeacherService();
        TeacherController teacherController = new TeacherController();
        TeachersService teachersService = new TeachersService();
        TeachersController teachersController = new TeachersController(teachersService);

        // Создание учителей
        Teacher teacher1 = teacherService.createTeacher(1, "Алина", "Сидорова");
        Teacher teacher2 = teacherService.createTeacher(2, "Александр", "Кириган");

        // Добавление учителей
        teachersController.add(teacher1);
        teachersController.add(teacher2);

        // Вывод учителей на консоль
        System.out.println("Список учителей:");
        teacherController.sendOnConsole(teachersService.getAllTeachers());

        // Редактирование учителя
        Teacher updatedTeacher = teacherService.createTeacher(1, "Алина", "Старкова");
        teachersController.update(0, updatedTeacher);

        // Вывод обновленного списка учителей на консоль
        System.out.println("Обновленный список учителей:");
        teacherController.sendOnConsole(teachersService.getAllTeachers());
    }
}