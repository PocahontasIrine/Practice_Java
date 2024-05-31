package lab7.var3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String[] words = scan.nextLine().split(" ");
        String answer = words[words.length - 1] + " ";
        for (int i = 0; i < words.length - 1; i++) {
            answer += words[i] + " ";
        }
        System.out.println("Преобразованное предложение:" + "\n" + answer);
    }
}
