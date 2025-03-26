/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

/**
 *
 * @author lihac
 */
public class modBerries extends DishDecorator {
    public modBerries(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Snow Berries";
    }

    @Override
    public int getCost() {
        return decoratedDish.getCost() + 6;
    }
}
