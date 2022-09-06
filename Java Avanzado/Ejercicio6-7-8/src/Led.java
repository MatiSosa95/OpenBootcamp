public class Led {
    private static Led led;
    boolean on=false;

    private Led() { }

    public static Led getInstance(){
        if (led==null){
            led=new Led();
        }
        return led;
    }

    public void isOn() {
        if (!on){
            on=true;
        }else{
            System.out.println("Ya está encendida");
        }

    }
}
