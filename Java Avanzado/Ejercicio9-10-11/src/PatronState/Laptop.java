package PatronState;

public class Laptop {

    public Estado estado;

    public Laptop() {
        this.estado = new EstadoApagado(this);
    }

    public void CambiarEstado(Estado estado){
        this.estado=estado;
    }

    public Estado getEstado() {return estado;}
}
