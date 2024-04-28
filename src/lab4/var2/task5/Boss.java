package lab4.var2.task5;

public class Boss extends Engineer{

    public Boss(String name, int age) {
        super(name, age);
    }

    @Override
    public void applyForJob(String name) {
        super.applyForJob(name);
    }

    @Override
    public void goToWork() {
        super.goToWork();
    }

    @Override
    public void sayName() {
        super.sayName();
    }

    public void giveJob(Engineer e, String name){
        e.applyForJob(name);
    }

    public void giveTask(Engineer e, String name){
        e.addTask(name);
    }
}
