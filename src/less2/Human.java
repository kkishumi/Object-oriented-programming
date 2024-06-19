package less2;

import java.util.ArrayList;
import java.util.List;

public class Human extends Actor {

    public List<GroceryList> order = new ArrayList<GroceryList>();

    public Human(String name) {
        super(name);
        order = new ArrayList<>();
        setMakeOrder(false);
        setTakeOrder(false);
    }

    public Human(String name, List<GroceryList> products) {
        super(name);
        order.addAll(products);
        setMakeOrder(true);
        setTakeOrder(false);
    }

    @Override
    public void setMakeOrder(boolean fag) {//флаг сделан ли заказ
        this.isMakeOrder = fag;
    }

    @Override
    public void setTakeOrder(boolean fag) {//флаг получен ли заказ
        this.isTakeOrder = fag;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return name;
    }

    public void saveOrder(GroceryList product){
        order.add(product);
        setMakeOrder(true);
    }

    public void saveOrder(List<GroceryList> products){
        order.addAll(products);
        setMakeOrder(true);
    }

    @Override
    public String toString() {
        return name;
    }

}