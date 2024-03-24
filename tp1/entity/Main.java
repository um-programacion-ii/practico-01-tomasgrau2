package entity;

public class Main {
    public static void main(String[] args) {
        Despensa despensa = new Despensa(5);

        Ingrediente huevo = new Ingrediente("Huevo", 12);
        Ingrediente leche = new Ingrediente("Leche", 1);
        despensa.agregarIngrediente(huevo, 0);// Agregamos el huevo en el índice 0
        despensa.agregarIngrediente(leche, 1); // Agregamos la leche en el índice 1

        Ingrediente ingredienteObtenido = despensa.obtenerIngrediente(0); // Obtenemos el ingrediente en el índice 0
        System.out.println("Ingrediente obtenido: " + ingredienteObtenido);
        Ingrediente ingredienteObtenido2 = despensa.obtenerIngrediente(1); // Obtenemos el ingrediente en el índice 0
        System.out.println("Ingrediente obtenido: " + ingredienteObtenido2);
    }
}