import java.util.ArrayList;

public interface DataBaseStore {
    void guardar(Vehiculo vehiculo);
    ArrayList<Vehiculo> listarTodos();
    Vehiculo obtener(String nombre);
    void eliminar(Vehiculo vehiculo);
}
