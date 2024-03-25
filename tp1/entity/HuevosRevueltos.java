package entity;

public class HuevosRevueltos extends Receta{

    public HuevosRevueltos() {
        super(5,
                "Romper dos huevos en la sarten y batirlos hasta estar cocidos",
                new Ingrediente[]{
                        new Ingrediente("huevo",2),
                        new Ingrediente("sal",20),
                        new Ingrediente("aceite", 20)
                });
    }
}
