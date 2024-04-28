package lab3.var3;

public class Window {
    private boolean isClosed = true;

    public void closeWindow(){
        if (!isClosed){
            isClosed = true;
            System.out.println("Now window is closed");
        }else{
            System.out.println("Window is already closed");
        }
    }

    public void openWindow(){
        if(isClosed){
            isClosed = false;
            System.out.println("Now window is opened");
        }else{
            System.out.println("Window is already opened");
        }
    }
}
