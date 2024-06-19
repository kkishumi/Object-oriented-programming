package less2;

public enum GroceryList {
    CARROT("Морковка"),
    POTATO ("Картошка"),
    SALT("Соль"),
    SUGAR ("Сахар"),
    BREAD("Хлеб"),
    MEAT ("Мясо"),
    MILK("Молоко");

    private String title;

    GroceryList(String string) {
        this.title = string;
    }

    public String getTitle() {
        return title;
    }
}



