package lab4.var1.task1;

public class Main {
    public static void main(String[] args) {
        City c1 = new City("Gorod", 1000);
        c1.addAvenue("asd", 1, 2);
        c1.addStreet("adsad");
        c1.getAvenues().get(0);
    }
}
