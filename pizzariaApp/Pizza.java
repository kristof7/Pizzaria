public class Pizza {

    private String pizzaName;
    private PizzaSize size;


    public Pizza(String name) {
        this.pizzaName = name;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public PizzaSize getSize(PizzaSize large) {
        return size;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String sizeofPizza(PizzaSize s) {
        size = s;
        return "Pizza: " + pizzaName + ", size: " + size;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizzaName;
    }
}
