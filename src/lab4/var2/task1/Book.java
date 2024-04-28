package lab4.var2.task1;

public abstract class Book {
    public String Style;
    public String author;
    public String name;
    public int year;
    public String publisher;

    public void buy(){
        System.out.println("Вы купили книгу " + name);
    }

    public abstract void gift();

    public abstract void read();
}
