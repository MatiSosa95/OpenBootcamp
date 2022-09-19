package PatronState;

public class EstadoSuspendido extends Estado{

    public EstadoSuspendido(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String prender() {
        laptop.CambiarEstado(new EstadoPrendido(laptop));
        return "PatronState.Laptop prendida";
    }

    @Override
    public String apagar() {
        return "(PatronState.Laptop Apagar) La laptop esta suspendida";
    }

    @Override
    public String suspender() {
        return "(PatronState.Laptop Suspender) La laptop esta suspendida";
    }

    @Override
    public String reiniciar() {
        return "(PatronState.Laptop Reiniciar) La laptop esta suspendida";
    }
}
