package entity;

import java.util.Arrays;

public class HuevoDuro extends Receta{

    public HuevoDuro() {
        super(10,
                "Poner un huevo en agua hirviendo durante 10 minutos",
                new Ingrediente[]{
                    new Ingrediente("Huevo",2),
                    new Ingrediente("Agua",200)
        });
    }

}
