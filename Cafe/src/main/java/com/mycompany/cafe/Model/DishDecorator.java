/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

/**
 *
 * @author lihac
 */
abstract class DishDecorator implements Dish {
    protected Dish decoratedDish;

    public DishDecorator(Dish decoratedDish) {
        this.decoratedDish = decoratedDish;
    }
    
    @Override
    public String getDescription() {
        return decoratedDish.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedDish.getCost();
    }
}
