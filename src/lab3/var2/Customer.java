package lab3.var2;

import java.util.GregorianCalendar;

public class Customer {
    private int id;
    private String name;
    private String sername;
    private String secName;
    private String adress;
    private int cardNumber;
    private int bankNumber;

    public Customer(int id, String name, String sername, String secName, String adress, int cardNumber, int bankNumber) {
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.secName = secName;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", secName='" + secName + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankNumber=" + bankNumber +
                '}';
    }

    public static Customer[] alphabet(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].sername.compareTo(customers[j].sername) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
        return customers;
    }

    public static Customer[] cardCheck(Customer[] customers, int start, int finish) {
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].cardNumber >= start && customers[i].cardNumber <= finish){
                count++;
            }
        }
        Customer[] newCustomers = new Customer[count];
        count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].cardNumber >= start && customers[i].cardNumber <= finish){
                newCustomers[count] = customers[i];
            }
        }
        return newCustomers;
    }
}
