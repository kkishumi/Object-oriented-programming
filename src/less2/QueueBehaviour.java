package less2;

import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Human actor);//войти в очередь

    void takeOrders();// сделать заказ

    void giveOrders(Human actor, List<GroceryList> products);// забрать заказы

    void releaseFromQueue(Human actor);// выйти из очереди



}


