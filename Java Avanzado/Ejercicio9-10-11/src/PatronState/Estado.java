package PatronState;

abstract public class Estado {

    public Laptop laptop;

    public Estado(Laptop laptop) {this.laptop = laptop;}

    abstract public String prender();
    abstract public String apagar();
    abstract public String suspender();
    abstract public String reiniciar();

}
