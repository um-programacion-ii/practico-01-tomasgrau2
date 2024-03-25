package entity;

import java.util.Arrays;

public class Receta {
    protected int tiempoCoccion;
    protected String preparacion;
    protected Ingrediente[] ingredientes;

    public Receta() {
        ingredientes = new Ingrediente[10];
    }

    public Receta(int tiempoCoccion, String preparacion, Ingrediente[] ingredientes) {
        this.tiempoCoccion = tiempoCoccion;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receta: [Tiempo de coccion: " + tiempoCoccion + ", Ingredientes: " + Arrays.toString(ingredientes) + ", Preparacion: " + preparacion + "]";
    }


}
