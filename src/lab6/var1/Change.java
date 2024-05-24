package lab6.var1;

import java.util.ArrayList;
import java.util.Random;

public class Change {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int temp = rand.nextInt(201) - 100;
            if(temp == 0){
                i--;
            }else {
                myList.add(temp);
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        for (int i = 0; i < 50; i++) {
            if(myList.get(i) > 0){
                myList.add(myList.get(i));
            }
        }
        for (int i = 0; i < 50; i++) {
            if(myList.get(i) < 0){
                myList.add(myList.get(i));
            }
        }
        for (int i = 0; i < 50; i++) {
            myList.remove(0);
        }
        System.out.println();
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
