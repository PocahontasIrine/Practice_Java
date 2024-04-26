import java.util.Scanner;

public class Main_lab2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//      task3();
       task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }

    public static void task1(){
        int n = scan.nextInt();
       // scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.next(); // записываем данные в каждую ячейку
        }
        int minLen = array[0].length();
        int maxLen = array[0].length();
        String minStr = array[0];
        String maxStr = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > maxLen){
                maxLen = array[i].length();
                maxStr = array[i];
            }
            if(array[i].length() < minLen){
                minLen = array[i].length();
                minStr = array[i];
            }
        }
        System.out.println("Самая большая строка: " + maxStr + ", ее длина: " + maxLen);
        System.out.println("Самая маленькая строка: " + minStr + ", ее длина: " + minLen);
    }

    public static void task2(){
        int n = scan.nextInt();
//        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.next(); // записываем данные в каждую ячейку
        }
        System.out.println("Массив до сортировки:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i].length() > array[j].length()){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nМассив после сортировки:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void task3(){
        int n = scan.nextInt();
//        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.next(); // записываем данные в каждую ячейку
            sum += array[i].length();
        }
        sum /= array.length;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > sum){
                System.out.println(array[i] + " " + array[i].length());
            }
        }
        System.out.println("Средняя длина = " + sum);
    }

    public static void task4(){
        int n = scan.nextInt();
//        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        int[] arrayCount = new int[n]; // массив, который знает количество уникальных символов каждого слова
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.next(); // записываем данные в каждую ячейку
        }
        for (int i = 0; i < array.length; i++) {  // проходим по всем словам
            int count = 0; // счетчик уникальных символов в слове
            for (int j = 0; j < array[i].length(); j++) { // проходимся по символам слова
                boolean f = true; // флаг, который отвечает за уникальность символа
                for (int k = 0; k < j; k++) { // проходимся по символам до фиксированного
                    if(array[i].charAt(k) == array[i].charAt(j)){
                        f = false;
                    }
                }
                if(f){
                    count++;
                }
            }
            arrayCount[i] = count;
        }
        int min = arrayCount[0];
        int index = 0;
        for (int i = 0; i < arrayCount.length; i++) {
            if(min > arrayCount[i]){
                min = arrayCount[i];
                index = i;
            }
        }
        System.out.println("Слово с наименьшим повторением символов: " + array[index] + ", количество уникальных сиволов: " + min);
    }

    public static void task5(){
        int n = scan.nextInt();
        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.nextLine(); // записываем данные в каждую ячейку
        }
        int wordsCount = 0;
        int balanceWords = 0;
        String vowelChars = "aeiouAEIOU";
        for (int i = 0; i < array.length; i++) {
            boolean f = true;
            for (int j = 0; j < array[i].length(); j++) {
                if (!((array[i].charAt(j) >= 'a' && array[i].charAt(j) <= 'z') || (array[i].charAt(j) >= 'A' && array[i].charAt(j) <= 'Z'))) {
                    f = false;
                }
            }
            if(f) {
                wordsCount++;
                int vowel = 0;
                int consonant = 0;
                for (int j = 0; j < array[i].length(); j++) {
                    if (vowelChars.indexOf(array[i].charAt(j)) == -1) {
                        consonant++;
                    } else {
                        vowel++;
                    }
                }
                if (vowel == consonant) {
                    balanceWords++;
                }
            }
        }
        System.out.println("Слова с латинскими символами: " + wordsCount);
        System.out.println("Слова с одинаковым количеством гласных и согласных: " + balanceWords);
    }

    public static void task6(){
        int n = scan.nextInt();
        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.nextLine(); // записываем данные в каждую ячейку
        }
        for (int i = 0; i < array.length; i++) {
            boolean f = true;
            for (int j = 1; j < array[i].length(); j++) {
                if(array[i].charAt(j) < array[i].charAt(j - 1)){
                    f = false;
                }
            }
            if(f){
                System.out.println("Первое подходящее слово: " + array[i]);
                break;
            }
        }
    }

    public static void task7(){
        int n = scan.nextInt();
        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.nextLine(); // записываем данные в каждую ячейку
        }
        for (int i = 0; i < array.length; i++) {
            String check = "";
            boolean f = true;
            for (int j = 0; j < array[i].length(); j++) {
                if(check.indexOf(array[i].charAt(j)) == -1){
                    check += array[i].charAt(j);
                }else{
                    f = false;
                }
            }
            if(f){
                System.out.println("Первое подходящее слово: " + array[i]);
                break;
            }
        }
    }

    public static void task8(){
        int n = scan.nextInt();
        scan.nextLine(); //считываем символ переноса строки(\n)
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) { // проходим по всем ячейкам массива
            array[i] = scan.nextLine(); // записываем данные в каждую ячейку
        }
        String first = "";
        boolean answer = true;
        for (int i = 0; i < array.length; i++) {
            boolean f = true;
            for (int j = 0; j < array[i].length(); j++) {
                if(!(array[i].charAt(j) >= '0' && array[i].charAt(j) <= '9')){
                    f = false;
                }
            }
            if(f){
                boolean g = true;
                for (int j = 0; j < array[i].length() / 2; j++) {
                    if(array[i].charAt(j) != array[i].charAt(array[i].length() - 1 - j)){
                        g = false;
                        break;
                    }
                }
                if(g){
                    if(!first.equals("")){
                        System.out.println("Второе подходящее слово: " + array[i]);
                        answer = false;
                        break;
                    }else{
                        first = array[i];
                    }
                }
            }
        }
        if(answer){
            System.out.println("Первое подходящее слово: " + first);
        }
    }

    public static void task9(){
        int k = scan.nextInt();
        switch (-10*(-k) < k && k <= 0 ? 0 : 0 < k && k <= 5 ? 1 : 5 < k && k <= 10 ? 2 : 3){
            case 0:
                System.out.println("Число находится в диапазоне от " + (-10 * k) + " до 0");
                break;
            case 1:
                System.out.println("Число находится в диапазоне от 0 до 5");
                break;
            case 2:
                System.out.println("Число находится в диапазоне от 5 до 10");
                break;
            case 3:
                System.out.println("Число находится в диапазоне от 10 до " + (10 * k));
                break;
        }
    }

    public static void task10(){
        int k = scan.nextInt();
        switch (-10*(-k) <= k && k <= 5 ? 0 : 0 <= k && k <= 10 ? 1 : 5 <= k && k <= 15 ? 2 : 3){
            case 0:
                System.out.println("Число находится в диапазоне от " + (-10 * k) + " до 5");
                break;
            case 1:
                System.out.println("Число находится в диапазоне от 0 до 10");
                break;
            case 2:
                System.out.println("Число находится в диапазоне от 5 до 15");
                break;
            case 3:
                System.out.println("Число находится в диапазоне от 10 до " + (10 * k));
                break;
        }
    }
}