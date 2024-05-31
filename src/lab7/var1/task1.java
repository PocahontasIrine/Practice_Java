package lab7.var1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //src/lab7/input.txt
        //src/lab7/output.txt
        System.out.println("Введите название файла для чтения:");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        try {
            Scanner fileInput = new Scanner(new File(nameInput));
            ArrayList<String> lines = new ArrayList<>();
            while (fileInput.hasNextLine()) {
                lines.add(fileInput.nextLine());
            }
            fileInput.close();
            System.out.println("Введите номер буквы:");
            int position = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите символ замены:");
            String change = scan.nextLine();
            String check = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
            for (int i = 0; i < lines.size(); i++) {
                String[] words = lines.get(i).split(" ");
                String answer = "";
                for (int j = 0; j < words.length; j++) {
                    if(words[j].length() >= position){
                        if(words[j].length() == position && check.indexOf(words[j].charAt(position - 1)) == -1){
                           answer += words[j] + " ";
                           continue;
                        }
                        if(words[j].length() == position){
                            words[j] = words[j].substring(0, position - 1) + change;
                        }else {
                            words[j] = words[j].substring(0, position - 1) + change + words[j].substring(position);
                        }
                    }
                    answer += words[j] + " ";
                }
                lines.set(i, answer);
            }
            System.out.println("Введите название файла для записи:");
            String nameOutput = scan.nextLine();
            try {
                FileWriter fileOutput = new FileWriter(nameOutput);
                for (int i = 0; i < lines.size(); i++) {
                    if(i == lines.size() - 1){
                        fileOutput.write(lines.get(i));
                    }else {
                        fileOutput.write(lines.get(i) + "\n");
                    }
                }
                fileOutput.close();
            }catch (IOException e){
                System.out.println("Файл " + nameOutput + " не найден");
            }
        }catch (IOException e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
