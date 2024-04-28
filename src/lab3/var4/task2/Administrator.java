package lab3.var4.task2;

public class Administrator {
    public void blockCreditCard(Client c){
        if(c.getCreditCard() < 0){
            c.setCreditCardAvailable(false);
        }
    }
}
