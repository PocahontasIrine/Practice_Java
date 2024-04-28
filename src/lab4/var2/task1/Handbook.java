package lab4.var2.task1;

public class Handbook extends Book{
    @Override
    public void gift() {
        System.out.println("Вы подарили справочник");
    }

    @Override
    public void read() {
        System.out.println("Справочник " + name + " был прочитан");
    }
}
