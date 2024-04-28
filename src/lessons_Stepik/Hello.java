package lessons_Stepik;

import java.util.Scanner;

public class Hello {
    public void hello(){
        System.out.println("lessons_Stepik.Hello");
    }

    public static class Main {
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
}
