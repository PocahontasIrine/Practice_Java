package lab3.var1;

public class Vector {
    private int[] array;
    private int size;

    public Vector(int size){
        array = new int[size];
        this.size = size;
    }

    public Vector(int[] array){
        this.array = array;
        this.size = array.length;
    }

    public Vector(Vector v){
        this.array = v.getArray();
        this.size = v.getSize();
    }

    public int[] getArray(){
        return array;
    }

    public int getSize(){
        return size;
    }

    //допускаем, что векторы одинакового размера
    public static Vector sum(Vector v1, Vector v2){
        Vector v3 = new Vector(v1.getSize());
        for (int i = 0; i < v1.getSize(); i++) {
            v3.getArray()[i] = v1.getArray()[i] + v2.getArray()[i];
        }
        return v3;
    }

    public void sum(Vector v2){
        for (int i = 0; i < this.getSize(); i++) {
            this.getArray()[i] += v2.getArray()[i];
        }
    }

    public Vector dif(Vector v2){
        Vector v3 = new Vector(v2.getSize());
        for (int i = 0; i < this.getSize(); i++) {
            v3.getArray()[i] = this.getArray()[i] - v2.getArray()[i];
        }
        return v3;
    }

    public Vector multiply(Vector v2){
        Vector v3 = new Vector(v2.getSize());
        for (int i = 0; i < this.getSize(); i++) {
            v3.getArray()[i] = this.getArray()[i] * v2.getArray()[i];
        }
        return v3;
    }

    public Vector inc(){
        Vector v3 = new Vector(this.getSize());
        for (int i = 0; i < this.getSize(); i++) {
            v3.getArray()[i] = this.getArray()[i] + 1;
        }
        return v3;
    }

    public Vector dic(){
        Vector v3 = new Vector(this.getSize());
        for (int i = 0; i < this.getSize(); i++) {
            v3.getArray()[i] = this.getArray()[i] - 1;
        }
        return v3;
    }

    public int index(int i){
        return this.getArray()[i];
    }

    public static int scalMultiply(Vector v1, Vector v2){
        Vector v3 = v1.multiply(v2);
        int result = 0;
        for (int i = 0; i < v3.getSize(); i++) {
            result += v3.index(i);
        }
        return result;
    }

    public static double vectorLength(Vector v1){
        int result = 0;
        for (int i = 0; i < v1.getSize(); i++) {
            result += v1.index(i) * v1.index(i);
        }
        return Math.sqrt(result);
    }

    public static double angle(Vector v1, Vector v2){
        return Math.toDegrees(Math.acos(Vector.scalMultiply(v1, v2) / (Vector.vectorLength(v1) * Vector.vectorLength(v2))));
    }
}