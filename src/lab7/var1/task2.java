package lab7.var1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите русский текст");
        String line = scan.nextLine();
        String check = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String lineCopy = line.toLowerCase();
        for (int i = 0; i < lineCopy.length(); i++) {
            if(check.indexOf(lineCopy.charAt(i)) == -1){
                continue;
            }
            System.out.print(line.charAt(i) + "  ");
        }
        System.out.println();
        for (int i = 0; i < lineCopy.length(); i++) {
            for (int j = 0; j < check.length(); j++) {
                if(check.charAt(j) == lineCopy.charAt(i)){
                    if(j + 1 >= 10){
                        System.out.print((j + 1) + " ");
                    }else {
                        System.out.print((j + 1) + "  ");
                    }
                    break;
                }
            }
        }
    }
}
