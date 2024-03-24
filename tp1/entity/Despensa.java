package entity;

public class Despensa {
    private Ingrediente[] ingredientes;


    public Despensa(int capacidad)
    {
        ingredientes = new Ingrediente[capacidad];
    }

    public void agregarIngrediente(Ingrediente ingrediente, int indice) {
        if (indice >= 0 && indice < ingredientes.length) {
            ingredientes[indice] = ingrediente;
        } else {
            System.out.println("El índice está fuera del rango del arreglo.");
        }
    }

    public Ingrediente obtenerIngrediente(int indice) {
        if (indice >= 0 && indice < ingredientes.length) {
            return ingredientes[indice];
        } else {
            System.out.println("El índice está fuera del rango del arreglo.");
            return null;
        }
    }
}
