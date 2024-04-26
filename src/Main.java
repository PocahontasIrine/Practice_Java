/*import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hello h1 = new Hello();
        h1.hello();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task2(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(e + " " + d + " " + c + " " + b + " " + a);
    }

    public static void task3(){
        Scanner scan = new Scanner(System.in);
        String a = scan.next(); // nextLine читает до пробела или до перехода на следующую строчку, поэтому заменила на просто next
        String b = scan.next();
        String c = scan.next();
        System.out.println(a + "\n" + b + "\n" + c);
        System.out.println(a + " " + b + " " + c);
    }

    public static void task4(){
        Scanner scan = new Scanner(System.in);
        String password = "abcd1234";
        System.out.println("Password is: " + password);
        String check = scan.nextLine();
        if(password.equals(check)){ // < > <= >= == !=
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
    }

    public static void task5(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a * b * c);
    }

    public static void task6(){
        Calendar claim = new GregorianCalendar(2024, 1, 10);
        claim.set(Calendar.HOUR, 14);
        System.out.println(claim.getTime() + " Барская Ирина");
        Calendar delivery = new GregorianCalendar(2024, 2, 1);
        delivery.set(Calendar.HOUR, 11);
        delivery.set(Calendar.MINUTE, 25);
        System.out.println(delivery.getTime() + " Барская Ирина");
    }
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
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a - c == 1 || a - c == -1 || a - c == 0 && b - d == 1 || b - d == -1 || b - d == 0 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }
    }
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a - c == 1 || a - c == -1 || a - c == 0 && b - d == 1 || b - d == -1 || b - d == 0 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
*/
/*
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        if((a==c || b==d) && (a-c == b-d)){
        System.out.println("YES");
        }else{
        System.out.println("NO");
        }
        }
        }

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
*/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = 1;
        while (n < a) {
            n = n * 2;
        }
        if (n == a) {
            System.out.print("YES");
        } else {
            System.out.println("NO");
        }
    }
}

        /*
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));

        System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));

        System.out.println("(" + a + " + " + b + ")" + " * " + c + " = " + (a + b) * c);
    }

}
       /* int a = scan.nextInt();
        // > < >= <= == !=
        int n = 2;
        boolean f = true;
        while (a >= n && f) {
            if (a % n == 0) {
                System.out.print(n + "");
                f = false;
            }
            n++;


            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));

            System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));

            System.out.println("(" + a + " + " + b + ")" + " * " + c + " = " + (a + b) * c);


        }
        // put your code here
        int a = scan.nextInt();
        int n = a;
        while(a != 0){
            if (a > n){
                n = a;
            }
            a = scan.nextInt();
        }
        System.out.println(n);// put your code here
    }
}
*/
