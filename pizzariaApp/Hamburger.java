public class Hamburger {

    private String hamburgerName;

    public Hamburger(String hamburgerName) {
        this.hamburgerName = hamburgerName;
    }

    @Override
    public String toString() {
        return "Hamburger: " + hamburgerName;
    }
}
