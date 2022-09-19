package PatronState;

public class EstadoReiniciado extends Estado{
    public EstadoReiniciado(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String prender() {
        laptop.CambiarEstado(new EstadoPrendido(laptop));
        return "PatronState.Laptop prendida";
    }

    @Override
    public String apagar() {
        return "(PatronState.Laptop apagar) La laptop se esta reiniciando";
    }

    @Override
    public String suspender() {
        return "(PatronState.Laptop suspender) La laptop se esta reiniciando";
    }

    @Override
    public String reiniciar() {
        return "(PatronState.Laptop reiniciar) La laptop se esta reiniciando";
    }
}
