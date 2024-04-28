package lab3.var4.task7;

public class Service {
    private String name;
    private double price;
    private boolean pay;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPay() {
        return pay;
    }

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
        this.pay = false;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
}
