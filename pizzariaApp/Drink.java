import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Drink {

    private String drinkType;
    private Integer quantity;

    public Drink(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String drinkNumber(int number) {
        quantity = number;
        return "Drink: " + drinkType + ", quantity: " + quantity;
    }

    @Override
    public String toString() {
        return "Drink: " + drinkType +
                ", quantity=" + quantity;
    }
}

