package less6.src.homework;

public class UserPersister implements Persistable {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Сохранение пользователя: " + user.getName());
    }
}
