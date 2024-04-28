package lab4.var2.task1;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Handbook();
        books[1] = new Encyclopedia();
        for (int i = 0; i < books.length; i++) {
            books[i].gift();
        }
    }
}
