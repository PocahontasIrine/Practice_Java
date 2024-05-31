package lab7.var2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите название файла для чтения:");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        try {
            Scanner fileInput = new Scanner(new File(nameInput));
            LinkedHashMap<String, Integer> words = new LinkedHashMap<>();
            String check = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
            while (fileInput.hasNextLine()) {
                String word = fileInput.next();
                if(check.indexOf(word.charAt(word.length() - 1)) == -1){
                    word = word.substring(0, word.length() - 1);
                }
                if(!words.containsKey(word)){
                    words.put(word, 1);
                }else {
                    words.put(word, words.get(word) + 1);
                }
            }
            fileInput.close();
            for (Map.Entry i: words.entrySet()) {
                System.out.println("Слово " + i.getKey() + " встречается " + i.getValue() + " раз");
            }
        }catch (IOException e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
