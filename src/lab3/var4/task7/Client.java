package lab3.var4.task7;

public class Client {
    private String number;
    private double balance;
    private Service[] services;
    private boolean available;

    public Client(String number) {
        this.number = number;
        this.balance = 0;
        this.services = null;
        this.available = true;
    }

    public void refill(double price){
        this.balance += price;
    }

    public void payment(){
        for (int i = 0; i < services.length; i++) {
            if(services[i].getPrice() <= this.balance && !services[i].isPay()){
                this.balance -= services[i].getPrice();
                services[i].setPay(true);
            }else{
                System.out.println("Недостаточно средств для оплаты всех услуг");
                break;
            }
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Service[] getServices() {
        return services;
    }

    public void changeNumber(){
        Administrator.changeNumber(this);
    }

    public void dropService(String name){
        this.services = Administrator.dropService(this, name);
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
