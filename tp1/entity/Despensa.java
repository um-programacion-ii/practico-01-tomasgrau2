package entity;

public class Despensa {
    Ingrediente[] ingredientes;

    public Despensa() {
        ingredientes = new Ingrediente[10];
    }


    public Despensa(int capacidad)
    {
        ingredientes = new Ingrediente[capacidad];
    }


    // Agregar el ingrediente en el primer espacio vacio (si es que hay) del arreglo
    public void agregarIngrediente(Ingrediente ingrediente) {
        for(int i = 0; i < ingredientes.length; i++)
        {
            if (ingredientes[i] == null)
            {
                ingredientes[i] = ingrediente;
                System.out.println("Se agrego el ingrediente en el lugar " + i + " de la despensa");
                return;
            }
            else
            {
                System.out.println("La despensa esta llena, no se puede agregar el ingrediente");
            }
        }
    }


    // Usar sacar ingrediente, arreglar
    public void getIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente != null && ingrediente.getNombre().equals(nombre)) {
                ingrediente.sacar(cantidad);
                System.out.println("Se saco la cantidad de " + cantidad + " " + nombre);
            }
            System.out.println("El ingrediente solicitado no se encuentra en la despensa");
        }
    }


}
