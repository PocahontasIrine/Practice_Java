package lab6.var2;

import java.util.ArrayList;

public class Parking {
    private ArrayList<String> places;

    public Parking(int size){
        this.places = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            places.add("Свободно");
        }
    }

    public void addCar(String carNumber){
        boolean f = false;
        for (int i = 0; i < places.size(); i++) {
            if(places.get(i).equals("Свободно")){
                places.set(i, carNumber);
                System.out.println("Ваша машина припаркована на место №" + (i + 1));
                f = true;
                break;
            }
        }
        if(!f){
            System.out.println("Свободных мест нет");
        }
    }

    public void bringCar(String carNumber){
        boolean f = false;
        for (int i = 0; i < places.size(); i++) {
            if(places.get(i).equals(carNumber)){
                places.set(i, "Свободно");
                System.out.println("Машина с места №" + (i + 1) + " покинула стоянку");
                f = true;
                break;
            }
        }
        if(!f){
            System.out.println("Машины с таким номером на парковке нет");
        }
    }

    public static void main(String[] args) {
        Parking p1 = new Parking(3);
        p1.addCar("erty");
        p1.addCar("354354");
        p1.addCar("asdhgafs");
        p1.addCar("bzxcbzx");
        p1.bringCar("354354");
        p1.addCar("xzc,mzxnc");
    }
}
