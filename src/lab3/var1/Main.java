package lab3.var1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector v1 = new Vector(3);
        Vector v2 = new Vector(3);
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
        for (int i = 0; i < matrixes.length; i++) {
            matrixes[i] = new Matrix(scan.nextInt(), scan.nextInt());
        }
    }
}
