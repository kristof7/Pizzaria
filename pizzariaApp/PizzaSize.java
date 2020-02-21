public enum PizzaSize {

    SMALL("Small", 25),
    MEDIUM("Medium", 34),
    LARGE("Large", 40);


    private String displayName;


    private int diameter;

    PizzaSize(String displayName, int diameter) {
        this.diameter = diameter;
        this.displayName = displayName;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return displayName + "(" + diameter + ")cm";
    }
}

