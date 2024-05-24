package lab5.var1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vector v1 = new Vector(2);
        Vector v2 = new Vector(3);
        try {
            Vector v3 = Vector.sum(v1, v2);
            int[] array = {1,2,3,4,5,6};
            Vector v4 = new Vector(array);
            Vector v5 = new Vector(v1);
            v3.getArray();
            v1.sum(v2);
            v3 = Vector.sum(v1, v2);
            System.out.println(Vector.angle(v1, v2));

            Vector vector = v1.dif(v2);

            Matrix[] matrixes = new Matrix[10];
            try {
                for (int i = 0; i < matrixes.length; i++) {
                    matrixes[i] = new Matrix(scan.nextInt(), scan.nextInt());
                }
            }catch (NoSuchElementException e){
                System.out.println("Пустой ввод");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Вектора разного размера");
        }catch (NullPointerException e){
            System.out.println("Вектор не существует");
        }catch (NegativeArraySizeException e){
            System.out.println("Некорректный размер");
        }
        try {
            Matrix m = new Matrix(2,2);
            m.getMatrix();
        }catch (NegativeArraySizeException e){
            System.out.println("asd");
        }finally {
            System.out.println("finally");
        }
        System.out.println("2345678");
    }
}
