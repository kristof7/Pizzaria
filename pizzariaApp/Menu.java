import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Menu {

    public static List<Object> putObjectIntoOrder(Object... objects) {
        return new ArrayList<>(Arrays.asList(objects));
    }

    public static Object[] pizzaList(Object... objects) {
        return new Object[3];
    }

    public static Object[] drinkList(Object... objects) {
        return new Object[3];
    }

    public static String pizzaSize(int size) {

        PizzaSize XXL = PizzaSize.LARGE;
        PizzaSize M = PizzaSize.MEDIUM;
        PizzaSize S = PizzaSize.SMALL;

        switch (size) {
            case 1:
                System.out.println(String.valueOf(S).toLowerCase());
                break;
            case 2:
                System.out.println(String.valueOf(M).toLowerCase());
                break;
            case 3:
                System.out.println(String.valueOf(XXL).toLowerCase());
                break;

            default: {
                System.out.println("Something went wrong, sorry...");

            }
        }
        return String.valueOf(size);
    }
}