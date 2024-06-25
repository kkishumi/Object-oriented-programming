package less5.view;

import less5.controller.StudentController;
import less5.controller.StudyGroupController;
import less5.model.StudyGroup;
import less5.model.DB.DataBase;
import less5.model.impl.Student;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class StudentView {
    private StudentController controller = new StudentController();
    private StudyGroupController groupController = new StudyGroupController();

    public void start() {
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать учебную группу");
            System.out.println("5 - выход");

            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> createGroup();
                case 5 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;

    }

    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents() {
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }

    private StudyGroup createGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя:");
        int teacherId = scanner.nextInt();

        System.out.println("Введите id студентов через запятую:");
        scanner.nextLine();
        String[] studentIdStrings = scanner.nextLine().split(",");
        List<Integer> studentIds = List.of(studentIdStrings).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        StudyGroup group = groupController.createGroup(teacherId, studentIds);
        System.out.println(group);
        return group;
    }
}
