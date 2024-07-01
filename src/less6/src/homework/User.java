package less6.src.homework;

// Реализуем интерфейс Reportable для отчетов о пользователях (Принцип разделения интерфейсов)
public class User implements Reportable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void report() {
        System.out.println("Отчет для пользователя: " + name);
    }
}