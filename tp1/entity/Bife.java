package entity;

public class Bife extends Receta {
    public Bife() {
        super(15,
                "Colocarle sal y pimienta al bife, tirar aceite en la sarten y colocar el bife en la misma",
                new Ingrediente[]{
                        new Ingrediente("carne",1),
                        new Ingrediente("sal",20),
                        new Ingrediente("pimienta", 20),
                        new Ingrediente("aceite", 20)
                });
    }
}
