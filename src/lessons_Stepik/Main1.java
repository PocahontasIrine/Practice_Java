package lessons_Stepik;

import java.util.Scanner;
public class Main1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int lastDigit =  a % 10;
//       System.out.println(lastDigit);
//       // вместо c - System.out.println(b - ((b / a) * a));
//    }
//}

// Сумма чисел трехзначного числа

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
        int lastDigit =  a % 10;
        int lastDigit1 =  a / 100;
        int lastDigit2 =  a / 10;
        int lastDigit3 =  lastDigit2 % 10;


//        int SumDigits = (a*b*c);;
        System.out.println(lastDigit);
        System.out.println(lastDigit1);
        System.out.println(lastDigit2);
        System.out.println(lastDigit3);

        System.out.println(lastDigit+lastDigit1+lastDigit3);
}
}

////Сумма чисел
//import java.util.Scanner;
//public class lessons_Stepik.Hello.Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        System.out.println(a+b);
//    }
//}
//
////Переворот
//import java.util.Scanner;
//public class lessons_Stepik.Hello.Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String[] inputs = scan.nextLine().split(" ");
//        for (int i = inputs.length-1; i > -1; i--) {
//            System.out.print(inputs[i] + " ");
//        }
//    }
//}
////Выражение
//import java.util.Scanner;
//public class lessons_Stepik.Hello.Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int result = (a+b+c);
//        System.out.println("1 + 2 + 3 = " + result);
//        System.out.println();
//        int result1 = (a*b*c);
//        System.out.println("1 * 2 * 3 = " + result1);
//        System.out.println();
//        int result2 = ((a+b)*c);
//        System.out.println("(1 + 2) * 3 = " + result2);
//        System.out.println();
//
//        //Если a=1, b = 2, c = 3
//        //
//        //1 + 2 + 3 = 6
//        //
//        //1 * 2 * 3 = 6
//        //
//        //(1 + 2) * 3 = 9
//    }
//}
//
////Белочки и орешки - 1
//import java.util.Scanner;
//public class lessons_Stepik.Hello.Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = b / a;
//        System.out.println(c);
//    }
//}
/*
int n = scan.nextInt();
// > < >= <= == !=
if(n > 0) {
    System.out.println("Positive");
}else{
    if(n == 0){
        System.out.println("Zero");
    }else {
        System.out.println("Negative");
    }
}
// && - все было истинно
// || - хотя бы одно истинно
// ! - делает отрицание
    if(n > 0 && n % 2 == 0){
    System.out.println("Positive Even");
}
while (true){
    int n = scan.nextInt();
    if(n > 0) {
        if(n % 3 == 0){
            continue;
        }
        System.out.println("Positive");
    }else{
        if(n == 0){
            break;
        }else {
            System.out.println("Negative");
        }
    }
}

    int a = 1;
    if(a > 5){
        int b = 1;
        }
        int b = 1;
        for (int i = 10; i > 0; i-=2){
        int temp = 1;
        System.out.print(i + " ");
        temp++;
        }
        int temp = 1;
*/