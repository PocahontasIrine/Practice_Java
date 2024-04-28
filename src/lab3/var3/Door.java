package lab3.var3;

public class Door {
    private boolean isClosed = true;

    public void closeDoor(){
        if (!isClosed){
            isClosed = true;
            System.out.println("Now door is closed");
        }else{
            System.out.println("Door is already closed");
        }
    }

    public void openDoor(){
        if(isClosed){
            isClosed = false;
            System.out.println("Now door is opened");
        }else{
            System.out.println("Door is already opened");
        }
    }
}
