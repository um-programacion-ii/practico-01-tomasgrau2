package entity;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente() {

    }
    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente: [Nombre: " + nombre + ", Cantidad: " + cantidad + "]";
    }

    public void sacar(int cantidadSolicitada) {
        if (cantidad >= cantidadSolicitada) {
            cantidad -= cantidadSolicitada;
            System.out.println("Se han sacado " + cantidadSolicitada + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente cantidad de " + nombre + " para sacar.");
        }
    }
}
