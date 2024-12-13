package com.project.observer;

import com.project.decorator.Cone;
import com.project.decorator.IceCream;
import com.project.decorator.Ingredients;
import com.project.decorator.Topping;

public class DecoratorClient {

    public void createDecorator() {
        IceCream iceCream =   new IceCream(
                                            new IceCream(
                                                    new IceCream(
                                                            new IceCream(Cone.CHOCOLATE), Topping.MANGO), Topping.AMERICAN_DRYFRUIT), Cone.VANILLA);
        Ingredients ingredients = iceCream.getIngredients();
        System.out.println(ingredients);

    }
}
