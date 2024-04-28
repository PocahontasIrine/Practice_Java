package lab3.var4.task2;

public class Client {
    private double valet;
    private boolean valetAvailable = true;
    private double creditCard;
    private boolean creditCardAvailable = true;

    public double getValet() {
        return valet;
    }

    public boolean isValetAvailable() {
        return valetAvailable;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public boolean isCreditCardAvailable() {
        return creditCardAvailable;
    }

    public void setCreditCardAvailable(boolean creditCardAvailable) {
        this.creditCardAvailable = creditCardAvailable;
    }

    public void addToValet(double valet) {
        this.valet += valet;
    }

    public void getFromValet(double valet){
        this.valet -= valet;
    }

    public Client(double valet, double creditCard) {
        this.valet = valet;
        this.creditCard = creditCard;
    }

    public Client(double valet) {
        this.valet = valet;
        this.creditCard = 85000;
    }

    public void payOrderByValet(double price){
        if(valetAvailable) {
            if (price <= valet) {
                valet -= price;
                System.out.println("Оплата прошла успешно");
            } else {
                System.out.println("На счете недостаточно средств");
            }
        }else{
            System.out.println("Счет недоступен");
        }
    }

    public void payOrderByCreditCard(double price){
        if(creditCardAvailable) {
            creditCard -= price;
            System.out.println("Оплата прошла успешно");
        }else{
            System.out.println("Карта заблокирована");
        }
    }

    public void payOtherValetByValet(Client c, double price){
        if(valetAvailable) {
            if (price <= valet) {
                valet -= price;
                c.addToValet(price);
                System.out.println("Перевод осуществился успешно");
            } else {
                System.out.println("На счете недостаточно средств");
            }
        }else{
            System.out.println("Счет недоступен");
        }
    }

    public void payOtherValetByCrediCard(Client c, double price){
        if(creditCardAvailable) {
            creditCard -= price;
            c.addToValet(price);
            System.out.println("Перевод осуществился успешно");
        }else{
            System.out.println("Карта заблокирована");
        }
    }

    public void blockCreditCard(){
        if(creditCardAvailable) {
            if (creditCard == 85000) {
                System.out.println("Карта успешно заблокирована");
                creditCardAvailable = false;
            }else{
                System.out.println("Для блокировки карты не хватает " + (85000 - creditCard) + " денег на счету");
            }
        }else{
            System.out.println("Карта уже была заблокирована");
        }
    }

    public void blockValet(){
        valet = 0;
        valetAvailable = false;
        System.out.println("Счет аннулирован");
    }
}
