package entity;

import service.CocinaService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Despensa despensa = new Despensa(20);

        Ingrediente agua = new Ingrediente("Agua", 200);
        Ingrediente huevo = new Ingrediente("Huevo", 2);
        Ingrediente carne = new Ingrediente("Carne", 1);
        Ingrediente sal = new Ingrediente("Sal", 1);
        Ingrediente pimienta = new Ingrediente("Pimienta", 20);
        Ingrediente aceite = new Ingrediente("Aceite", 20);

        despensa.agregarIngrediente(agua);
        despensa.agregarIngrediente(huevo);
        despensa.agregarIngrediente(carne);
        despensa.agregarIngrediente(sal);
        despensa.agregarIngrediente(pimienta);
        despensa.agregarIngrediente(aceite);

        Receta bife = new Bife();
        Receta huevoduro = new HuevoDuro();

        // Preparacion de Receta exitosa
        System.out.println("++++++++++++++ Preparacion de receta exitosa ++++++++++++++\n");
        CocinaService cocina = new CocinaService(despensa);
        System.out.println(cocina.cocinar(huevoduro));
        System.out.println(Arrays.toString(despensa.getIngredientes()));
        System.out.println("\n");

        // Faltan todos los ingredientes
        System.out.println("++++++++++++++ Faltan todos los ingredientes ++++++++++++++\n");
        System.out.println(cocina.cocinar(huevoduro));
        System.out.println(Arrays.toString(despensa.getIngredientes()));
        System.out.println("\n");

        // Falta un ingrediente
        System.out.println("++++++++++++++ Falta 1 ingrediente ++++++++++++++\n");
        System.out.println(cocina.cocinar(bife));
        System.out.println("\n");







    }
}