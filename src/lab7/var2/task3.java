package lab7.var2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите название файла для чтения:");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        try {
            Scanner fileInput = new Scanner(new File(nameInput));
            LinkedHashMap<Character, Integer> letter = new LinkedHashMap<>();
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if(!letter.containsKey(line.charAt(i))){
                        letter.put(line.charAt(i), 1);
                    }else{
                        letter.put(line.charAt(i), letter.get(line.charAt(i)) + 1);
                    }
                }
            }
            fileInput.close();
            System.out.println("Введите n:");
            int n = scan.nextInt();
            System.out.println(n + " самых часто встречаемых символов:");
            for (int i = 0; i < n; i++) {
                int max = 0;
                char c = ' ';
                for (Map.Entry j: letter.entrySet()) {
                    if((int)j.getValue() > max){
                        max = (int)j.getValue();
                        c = (char)j.getKey();
                    }
                }
                System.out.println((i + 1) + ") " + c + " " + max);
                letter.remove(c);
            }

        }catch (IOException e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
