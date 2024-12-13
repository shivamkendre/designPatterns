package com.project.decorator;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private Cone cone;
    private Topping topping;
    private IceCream baseIceCream;


    public IceCream(Cone cone) {
        this.cone = cone;
    }


    public IceCream(IceCream iceCream, Cone cone) {
        this.cone = cone;
        this.baseIceCream = iceCream;
    }

    public IceCream(IceCream iceCream, Topping topping) {
        this.topping = topping;
        this.baseIceCream = iceCream;
    }



    public Ingredients getIngredients() {
        if (baseIceCream != null) {
           Ingredients ingredients = baseIceCream.getIngredients();
           if(this.cone != null) {
               ingredients.addCone(this.cone);
           }
           if(this.topping != null) {
               ingredients.addTopping(this.topping);
           }
           return ingredients;
        }else
              return  Ingredients.getIngredients(cone, topping);
    }


}
