package less2;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        Human Anthony = new Human("Энтони");
        Human Ashley = new Human("Эшли");
        Human Ivy = new Human("Иви");
        Human Amelia = new Human("Амелия");
        Human Harry = new Human("Гарри");
        Human Carl = new Human("Карл");
        Human Oliver = new Human("Оливер");

        Market lighthouse = new Market();


        lighthouse.acceptToMarket(List.of(Anthony, Ashley, Ivy, Amelia, Carl, Harry));


        lighthouse.giveOrders(Anthony, List.of(GroceryList.SUGAR, GroceryList.SALT, GroceryList.MILK));

        lighthouse.giveOrders(Ashley, List.of(GroceryList.SUGAR, GroceryList.BREAD, GroceryList.POTATO, GroceryList.MEAT));

        lighthouse.giveOrder(Ivy, GroceryList.CARROT);

        lighthouse.giveOrder(Amelia, GroceryList.CARROT);


        lighthouse.update();


        lighthouse.releaseFromMarket(Ashley);

        lighthouse.releaseFromMarket(Ivy);


        lighthouse.acceptToMarket(Oliver);

        lighthouse.giveOrder(Oliver, GroceryList.MILK);


        lighthouse.update();


        lighthouse.releaseFromMarket();


        lighthouse.update();

    }
}


