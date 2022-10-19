public abstract class Vehiculo {

    public int velocidad;
    public String nombre;
    public String color;
    public String tipo;

    public Vehiculo(int velocidad, String nombre, String color, String tipo) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
    }

    public void acelerar(){
        velocidad++;
    };
    public void frenar(){
        velocidad--;
    };

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
