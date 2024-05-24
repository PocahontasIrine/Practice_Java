package lab5.var4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
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
            System.out.println("Введите название для файла записи:");
            String nameOutput = scan.nextLine();
            try {
                File out = new File(nameOutput + ".txt");
                if(out.createNewFile()){
                    System.out.println("Файл " + nameOutput + ".txt создан");
                    FileWriter fileOutput = new FileWriter(nameOutput + ".txt");
                    for (int i = 0; i < lines.size(); i++) {
                        if(i == lines.size() - 1){
                            for (int j = lines.get(i).length() - 1; j >= 0; j--) {
                                fileOutput.write(lines.get(i).charAt(j));
                            }
                        }else {
                            for (int j = lines.get(i).length() - 1; j >= 0; j--) {
                                fileOutput.write(lines.get(i).charAt(j));
                            }
                            fileOutput.write("\n");
                        }
                    }
                    fileOutput.close();
                }
            }catch (IOException e){
                System.out.println("Файл " + nameOutput + " не найден");
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл " + nameInput + " не найден");
        }
    }
}
