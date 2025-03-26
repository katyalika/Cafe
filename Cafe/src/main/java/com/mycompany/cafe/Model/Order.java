/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

import com.mycompany.cafe.Model.Dish;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author lihac
 */
public class Order {    
    private ArrayList<Dish> dishes = new ArrayList<>(); 
    private String time;

    public void addDish(Dish dish) {
        dishes.add(dish);
        time = java.time.LocalTime.now().toString();
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Order Time: ").append(time).append("\n");
        details.append("Full Order: ");
        for (Dish dish : dishes) {
            details.append(dish.getDescription()).append(", ");
        }
        details.append("\nTotal Cost: ").append(getTotalCost()).append(" septims");
        return details.toString();
    }

    public int getTotalCost() {
        return dishes.stream().mapToInt(Dish::getCost).sum();
    }
}
