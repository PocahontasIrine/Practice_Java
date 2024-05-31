package lab7.var3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String[] words = scan.nextLine().split(" ");
        String temp = words[0];
        if(words[words.length - 1].charAt(words[words.length - 1].length() - 1) == '.'){
            temp += '.';
            words[words.length - 1] = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
        }
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        System.out.println("Преобразованное предложение:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
