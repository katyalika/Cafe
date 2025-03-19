/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

import com.mycompany.cafe.Model.Order;

/**
 *
 * @author lihac
 */
public class modBread extends DishDecorator{
    public modBread(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + " + Nordic Bread";
    }

    @Override
    public int getCost() {
        return decoratedDish.getCost() + 7;
    }
}
