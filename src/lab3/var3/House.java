package lab3.var3;

import java.util.Arrays;

public class House {
    private Door[] doors;
    private Window[] windows;

    public void addDoor(Door d){
        Door[] temp = new Door[doors.length + 1];
        for (int i = 0; i < doors.length; i++) {
            temp[i] = doors[i];
        }
        temp[temp.length - 1] = d;
        doors = temp;
    }

    public void addWindow(Window w){
        Window[] temp = new Window[windows.length + 1];
        for (int i = 0; i < windows.length; i++) {
            temp[i] = windows[i];
        }
        temp[temp.length - 1] = w;
        windows = temp;
    }

    public boolean equals(House h) {
        if (this.windows == h.windows && this.doors == h.doors){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(doors);
        result = 31 * result + Arrays.hashCode(windows);
        return result;
    }

    @Override
    public String toString() {
        return "Дом состоит из " + doors.length + " дверей и " + windows.length + " окон";
    }
}
