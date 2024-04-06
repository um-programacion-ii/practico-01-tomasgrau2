package entity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Despensa despensa = new Despensa(1);

        Ingrediente huevo = new Ingrediente("Huevo", 12);
        Ingrediente leche = new Ingrediente("Leche", 1);
        System.out.println(huevo.sacar(1));  // Cantidad que si puede sacar
        System.out.println(huevo.sacar(13)); // Intenta sacar mas de lo que tiene
        despensa.agregarIngrediente(huevo); // Agregamos un ingrediente a la despensa
        despensa.agregarIngrediente(leche); // Intento agregar un ingrediente pero la despensa ya esta llena
        System.out.println(Arrays.toString(despensa.ingredientes)); // Cantidad de huevo antes de sacar
        despensa.getIngrediente("Huevo",2);
        System.out.println(Arrays.toString(despensa.ingredientes)); // Cantidad de huevo despues
        despensa.getIngrediente("Pepino",3); // Intento solicitar un ingrediente que no se encuentra en la despensa

    }
}