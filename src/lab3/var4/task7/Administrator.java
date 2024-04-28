package lab3.var4.task7;

import java.util.Scanner;

public class Administrator {
    public static void changeNumber(Client c){
        Scanner scan = new Scanner(System.in);
        c.setNumber(scan.nextLine());
    }

    public static Service[] dropService(Client c, String name){
        Service[] temp = new Service[c.getServices().length - 1];
        int count = 0;
        for(int i = 0; i < c.getServices().length; i++){
            if(!c.getServices()[i].getName().equals(name)){
                temp[count] = c.getServices()[i];
                count++;
            }
        }
        return temp;
    }

    public void checkServices(Client c){
        boolean check = true;
        for (int i = 0; i < c.getServices().length; i++) {
            if(!c.getServices()[i].isPay()){
                check = false;
                break;
            }
        }
        if(!check){
            System.out.println("Отключение абонента за неуплату");
            c.setAvailable(false);
        }
    }
}
