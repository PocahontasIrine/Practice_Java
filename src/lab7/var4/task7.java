package lab7.var4;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String check = "qwertyuiopasdfghjklzxcvbnmйцукенгшщзхъфывапролджэёячсмитьбю";
        System.out.println("Введите текст:");
        String[] words = scan.nextLine().split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(check.indexOf(words[i].charAt(0)) != -1){
                count++;
            }
        }
        System.out.println("Количество слов начинающихся с прописной буквы: " + count);
    }
}
