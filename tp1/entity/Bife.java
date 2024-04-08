package entity;

public class Bife extends Receta {
    public Bife() {
        super(15,
                "Colocarle sal y pimienta al bife, tirar aceite en la sarten y colocar el bife en la misma",
                new Ingrediente[]{
                        new Ingrediente("Carne",1),
                        new Ingrediente("Sal",20),
                        new Ingrediente("Pimienta", 20),
                        new Ingrediente("Aceite", 20)
                });
    }
}
