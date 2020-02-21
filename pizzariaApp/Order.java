import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private Client client;
    private List<Object> meal;

    public Order(Client client, List<Object> meal) {
        this.client = client;
        this.meal = meal;
    }

    public String toOrder(int orderNumber) {
        return orderNumber + " order: " + client + ".";
    }
}
