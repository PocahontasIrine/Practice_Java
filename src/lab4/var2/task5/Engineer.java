package lab4.var2.task5;

import java.util.List;

public class Engineer implements Employee{

    String name;
    int age;
    String office;
    boolean available;
    List<String> tasks;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void applyForJob(String name) {
        System.out.println("Теперь вы устроены на " + name);
        office = name;
        available = true;
    }

    @Override
    public void goToWork() {
        if (available) {
            System.out.println("Вы сходили на работу");
        }else{
            System.out.println("Вы нигде не работаете, сначала устройтесь на работу");
        }
    }

    @Override
    public void sayName() {
        System.out.println("Мое имя " + name);
    }

    public void addTask(String name){
        tasks.add(name);
    }
}
