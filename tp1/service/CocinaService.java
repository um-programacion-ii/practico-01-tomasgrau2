package service;

import entity.Despensa;
import entity.Ingrediente;
import entity.Receta;

public class CocinaService {
    // El chef utilizará CocinaService para preparar una receta
    Despensa despensa;
    public CocinaService(Despensa despensa) {
        this.despensa = despensa;
    }


//    Cocinar
    public String cocinar(Receta receta)
    {
        if(check_ingredients(receta))
        {
            System.out.println(receta.getPreparacion());
            for(Ingrediente ingrediente_cocinar : receta.getIngredientes())
            {
                despensa.getIngrediente(ingrediente_cocinar.getNombre(),ingrediente_cocinar.getCantidad());
                Ingrediente ingrediente_despensa = despensa.getIngrediente2(ingrediente_cocinar.getNombre());
                System.out.println("Restante en despensa: " + ingrediente_despensa.getCantidad() + " " + ingrediente_despensa.getNombre());
            }
            return "Listo";
        }
        else{
            ingredientes_faltantes(receta);
            return "No se pudo realizar la receta";
        }
    }



    public boolean check_ingredients(Receta receta){
        // Checkeo si falta algun ingrediente, con que falte solo uno ya dara false
        for(Ingrediente ingrediente_necesario : receta.getIngredientes())
        {
            if (!despensa.dispIngrediente(ingrediente_necesario.getNombre(), ingrediente_necesario.getCantidad()))
            {
                return false;
            }
        }
        return true;
    }

    public void ingredientes_faltantes(Receta receta)
    {
        for (Ingrediente ingrediente_necsario : receta.getIngredientes())
        {
            if (!despensa.dispIngrediente(ingrediente_necsario.getNombre(), ingrediente_necsario.getCantidad()))
            {
                Ingrediente ingrediente_despensa = despensa.getIngrediente2(ingrediente_necsario.getNombre());
                System.out.println(ingrediente_despensa.sacar(ingrediente_necsario.getCantidad()));
            }
        }
    }


}
