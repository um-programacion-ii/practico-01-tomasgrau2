package entity;

public class Despensa {
    private Ingrediente[] ingredientes;


    public Despensa(int capacidad)
    {
        ingredientes = new Ingrediente[capacidad];
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        for(int i = 0; i < ingredientes.length; i++)
        {
            if (ingredientes[i] == null)
            {
                ingredientes[i] = ingrediente;
                return;
            }
        }
        System.out.println("La despensa esta llena");
    }


    // Usar sacar ingrediente, arreglar
    public String getIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente != null && ingrediente.getNombre().equals(nombre)) {
                return ingrediente.sacar(cantidad);
            }
        }
        return "El ingrediente " + nombre + " no se encuentra en la despensa";
    }

    public Ingrediente getIngrediente2(String nombre) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente != null && ingrediente.getNombre().equals(nombre)) {
                return ingrediente;
            }
        }
        return null;
    }

    public boolean dispIngrediente(String nombre, int cantidad)
            // Chequear disponibilidad de un ingrediente sin sacarlo de la despensa
    {
        for (Ingrediente ingrediente : ingredientes)
        {
            if (ingrediente != null && ingrediente.getNombre().equals(nombre))
            {
                if (ingrediente.getCantidad() >= cantidad)
                {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

}
