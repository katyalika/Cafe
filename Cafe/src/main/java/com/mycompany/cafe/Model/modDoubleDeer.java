/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

/**
 *
 * @author lihac
 */
public class modDoubleDeer extends DishDecorator{
    public modDoubleDeer(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Double Deer";
    }

    @Override
    public int getCost() {
        return decoratedDish.getCost() + 20;
    }
}
