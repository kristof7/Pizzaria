import java.sql.SQLOutput;
import java.util.*;

public class PizzeriaApp extends Menu {

    public static void main(String[] args) throws Exception {

        Pizza capriciosa = new Pizza("Capriciosa");
        Pizza pepperoni = new Pizza("Pepperoni");
        Pizza hawaiian = new Pizza("Hawaiian");
        Drink juice = new Drink("Juice");
        Drink beer = new Drink("Beer");
        Drink cola = new Drink("Cola");

        Object[] pizzaList = Menu.pizzaList();
        pizzaList[0] = capriciosa;
        pizzaList[1] = pepperoni;
        pizzaList[2] = hawaiian;
        Object[] drinkList = Menu.drinkList();
        drinkList[0] = juice;
        drinkList[1] = beer;
        drinkList[2] = cola;

        Client client1 = new Client("Adam", "Pogodna 13", "+48-505-550-979");
        Client client2 = new Client("Anna", "Długa 18/3", "+48-515-554-029");
        Client client3 = new Client("Paweł", "Grunwaldzka 472b", "+48-885-557-699");

        List<Object> orderList1 = Menu.putObjectIntoOrder();
        orderList1.add(juice.drinkNumber(1));
        orderList1.add(pepperoni.sizeofPizza(PizzaSize.LARGE));

        List<Object> orderList2 = Menu.putObjectIntoOrder();
        orderList2.add(cola.drinkNumber(1));
        orderList2.add(hawaiian.sizeofPizza(PizzaSize.SMALL));
        orderList2.add(capriciosa.sizeofPizza(PizzaSize.MEDIUM));

        List<Object> orderList3 = Menu.putObjectIntoOrder();
        orderList3.add(beer.drinkNumber(1));
        orderList3.add(new Hamburger("Hamburger"));


        Order pizzeriaOrder1 = new Order(client1, orderList1);
        Order pizzeriaOrder2 = new Order(client2, orderList2);
        Order pizzeriaOrder3 = new Order(client3, orderList3);
        System.out.println("ACTUAL ORDERS:");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(pizzeriaOrder1.toOrder(1));

        for (Object o : orderList1) {
            System.out.println(o);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(pizzeriaOrder2.toOrder(2));

        for (Object o : orderList2) {
            System.out.println(o);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(pizzeriaOrder3.toOrder(3));

        for (Object o : orderList3) {
            System.out.println(o);
        }
        System.out.println("============================================================================================");

    }
}
