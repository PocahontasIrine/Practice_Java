package lab5.var1;

import java.util.Random;

public class Matrix {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        try {
            this.matrix = matrix;
        }catch (NullPointerException e){
            System.out.println("Что-то не так с входными данными");
        }
    }

    public Matrix(int[][] matrix) {
        try {
            this.matrix = matrix;
        }catch (NullPointerException e){
            System.out.println("Что-то не так с входными данными");
        }
    }

    public Matrix(Matrix matrix) {
        try {
            this.matrix = matrix.getMatrix();
        }catch (NullPointerException e){
            System.out.println("Что-то не так с входными данными");
        }
    }

    public Matrix(int m, int n){
        if(m <= 0 || n <= 0){
            throw new NegativeArraySizeException();
        }
        matrix = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void changeLineInKColomn(Matrix matrix, int k){
        try {
            int min = Integer.MAX_VALUE;
            int indexMin = 0;
            int max = Integer.MIN_VALUE;
            int indexMax = 0;
            for (int i = 0; i < matrix.getMatrix().length; i++) {
                if (matrix.getMatrix()[i][k] > max) {
                    max = matrix.getMatrix()[i][k];
                    indexMax = i;
                }
                if (matrix.getMatrix()[i][k] < min) {
                    min = matrix.getMatrix()[i][k];
                    indexMin = i;
                }
            }
            for (int i = 0; i < matrix.getMatrix()[0].length; i++) {
                int temp = matrix.getMatrix()[indexMin][i];
                matrix.getMatrix()[indexMin][i] = matrix.getMatrix()[indexMax][i];
                matrix.getMatrix()[indexMax][i] = temp;
            }
        }catch (NullPointerException e){
            System.out.println("Что-то не так с входными данными");
        }
    }

    public static void powerMatrix(Matrix matrix){
        try {
            int[][] matrixAnswer = new int[matrix.getMatrix().length][matrix.getMatrix()[0].length];
            for (var i = 0; i < matrix.getMatrix().length; i++) {
                for (var j = 0; j < matrix.getMatrix()[0].length; j++) {
                    matrixAnswer[i][j] = 0;
                    for (var k = 0; k < matrix.getMatrix()[0].length; k++) {
                        matrixAnswer[i][j] += matrix.getMatrix()[i][k] * matrix.getMatrix()[k][j];
                    }
                }
            }
            matrix.setMatrix(matrixAnswer);
        }catch (NullPointerException e){
            System.out.println("Что-то не так с входными данными");
        }
    }
}
