package PatronState;

public class EstadoApagado extends Estado{

    public EstadoApagado(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String prender() {
        laptop.CambiarEstado(new EstadoPrendido(laptop));
        return "PatronState.Laptop Encendida";
    }

    @Override
    public String apagar() {
        return "(PatronState.Laptop apagar) PatronState.Laptop apagada ";
    }

    @Override
    public String suspender() {
        return "(PatronState.Laptop suspender) PatronState.Laptop apagada ";
    }

    @Override
    public String reiniciar() {
        return "(PatronState.Laptop reiniciar) PatronState.Laptop apagada ";
    }
}
