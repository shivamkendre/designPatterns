package com.project.decorator;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    List<Cone> cones;
    List<Topping> toppings;

    public Ingredients addCone(Cone cone) {
        cones.add(cone);
        return this;
    }

    private Ingredients() {
        cones = new ArrayList<Cone>();
        toppings = new ArrayList<>();
    }

    public static Ingredients getIngredients(Cone cone, Topping topping) {
        Ingredients ingredients = new Ingredients();
        if(cone != null)
            ingredients.addCone(cone);
        if(topping != null)
            ingredients.addTopping(topping);
        return ingredients;
    }

    public Ingredients addTopping(Topping topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "cones=" + cones +
                ", toppings=" + toppings +
                '}';
    }
}
