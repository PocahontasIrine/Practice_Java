package lab4.var2.task1;


public class Encyclopedia extends Book {
    @Override
    public void gift() {
        System.out.println("Вы подарили энциклопедию");
    }

    @Override
    public void read() {
        System.out.println("Энциклопедия " + name + " была прочитана");
    }
}
