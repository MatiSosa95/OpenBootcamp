package Adapter;

public class BombillaInglesa {
    boolean poweredOn= false;
    int voltage= 0;

    public void turnOn(int voltage){
        poweredOn= true;
        this.voltage= voltage;
        System.out.println("bombilla poweredOn with "+ voltage+ " of current");
    }

    public void turnOff(){
        poweredOn= false;
        voltage=0;
        System.out.println("bombilla poweredOff with "+ voltage+ " of current");
    }

    public boolean inPoweredOn(){
        return poweredOn;
    }
}
