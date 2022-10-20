import java.util.ArrayList;

public class DataBase implements DataBaseStore{
    ArrayList<Vehiculo> vehiculos= new ArrayList<>();

    @Override
    public ArrayList<Vehiculo> listarTodos() {
        return vehiculos;
    }

    @Override
    public Vehiculo obtener(String  nombre) {
        for(Vehiculo v1: vehiculos){
            if (v1.nombre.equalsIgnoreCase(nombre)){
                return v1;
            }
        }
        return null;
    }

    @Override
    public void guardar(Vehiculo vehiculo) {
        if (vehiculo!= null){
            vehiculos.add(vehiculo);
        }
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        for(Vehiculo v1: vehiculos){
            if (v1.equals(vehiculo)){
                vehiculos.remove(vehiculo);
            }
        }

    }
}
