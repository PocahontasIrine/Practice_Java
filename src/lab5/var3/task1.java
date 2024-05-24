package lab5.var3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите название файла для чтения:");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        try {
            Scanner fileInput = new Scanner(new File(nameInput));
            ArrayList<String> lines = new ArrayList<>();
            while(fileInput.hasNextLine()){
                lines.add(fileInput.nextLine());
            }
            fileInput.close();
            System.out.println("Введите строку для удаления:");
            String delete = scan.nextLine();
            for (int i = 0; i < lines.size(); i++) {
                if(lines.get(i).contains(delete)){
                    int start = lines.get(i).indexOf(delete);
                    int finish = start + delete.length();
                    String answer = "";
                    for (int j = 0; j < start; j++) {
                        answer += lines.get(i).charAt(j);
                    }
                    for (int j = finish; j < lines.get(i).length(); j++) {
                        answer += lines.get(i).charAt(j);
                    }
                    lines.set(i, answer);
                }
                if(lines.get(i).charAt(0) == ' '){
                    lines.set(i, lines.get(i).substring(1));
                }
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
        }catch (Exception e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
