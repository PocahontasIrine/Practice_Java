package lab7.var4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String[] words = scan.nextLine().toLowerCase().split(" ");
        System.out.println("Введите слово для поиска:");
        String target = scan.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].charAt(words[i].length() - 1) == '.' || words[i].charAt(words[i].length() - 1) == ','){
                words[i] = words[i].substring(0, words[i].length() - 1);
            }
            if(words[i].equals(target)){
                count++;
            }
        }
        System.out.println("Слово " + target + " входит в текст " + count + " раза");
        //В тот же миг Алиса юркнула за ним следом, не думая о том, как же она будет выбираться обратно. Нора сначала шла прямо, ровная, как туннель, а потом вдруг круто обрывалась вниз. Не успела Алиса и глазом моргнуть, как она начала падать, словно в глубокий колодец.
    }
}
