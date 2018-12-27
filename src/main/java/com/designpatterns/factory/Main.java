package com.designpatterns.factory;

/**
 * @author: BaoZhou
 * @date : 2018/12/27 11:08
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Food food = FoodFactory.FoodFactory(AppleFood.class);
        Food food2 = FoodFactory.FoodFactory(BeefFood.class);
        Food food3 = FoodFactory.FoodFactory(VegetableFood.class);
        System.out.println(food.type());
        System.out.println(food2.type());
        System.out.println(food3.type());
    }
}
