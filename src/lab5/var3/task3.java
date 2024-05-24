package lab5.var3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
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
            String check = "eyuioaEYUIOA";
            for (int i = 0; i < lines.size(); i++) {
                String[] temp = lines.get(i).split(" ");
                String answer = "";
                for (int j = 0; j < temp.length; j++) {
                    if(check.indexOf(temp[j].charAt(0)) != -1){
                        answer += temp[j] + " ";
                    }
                }
                lines.set(i, answer);
            }
            System.out.println("Введите название файла для записи:");
            String nameOutput = scan.nextLine();
            try {
                FileWriter fileOutput = new FileWriter(nameOutput);
                fileOutput.write("Слова, которые начинаются с гласных букв:" + "\n");
                for (int i = 0; i < lines.size(); i++) {
                    if(lines.get(i).equals("")){
                        continue;
                    }
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
        }catch (FileNotFoundException e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
