package com.designpatterns.factory;

/**
 * 简单工程模式(反射)
 * @author BaoZhou
 * @date 2018/12/27
 */
public class FoodFactory {

    static  Food FoodFactory(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (Food)Class.forName(clazz.getName()).newInstance();
    }
}
