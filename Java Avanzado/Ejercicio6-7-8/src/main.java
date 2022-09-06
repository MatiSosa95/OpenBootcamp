public class main {

    public static void main(String []args){

        Led led1= Led.getInstance();
        Led led2= Led.getInstance();

        led1.isOn();
        led2.isOn();

        System.out.println(led1+ " "+ led2);
    }
}
