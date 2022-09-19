package PatronState;

public class EstadoPrendido extends Estado{

    public EstadoPrendido(Laptop laptop) {
        super(laptop);
    }

    @Override
    public String prender() {
        return "La laptop esta prendida";
    }

    @Override
    public String apagar() {
        laptop.CambiarEstado(new EstadoApagado(laptop));
        return "PatronState.Laptop apagada";
    }

    @Override
    public String suspender() {
        laptop.CambiarEstado(new EstadoSuspendido(laptop));
        return "PatronState.Laptop Suspendida";
    }

    @Override
    public String reiniciar() {
        laptop.CambiarEstado(new EstadoReiniciado(laptop));
        System.out.println("Reiniciando...");
        laptop.estado.prender();
        return "PatronState.Laptop reiniciada";
    }
}
