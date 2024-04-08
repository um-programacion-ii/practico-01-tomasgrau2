package entity;

public class HuevosRevueltos extends Receta{

    public HuevosRevueltos() {
        super(5,
                "Romper dos huevos en la sarten y batirlos hasta estar cocidos",
                new Ingrediente[]{
                        new Ingrediente("Huevo",2),
                        new Ingrediente("Sal",20),
                        new Ingrediente("Aceite", 20)
                });
    }
}
