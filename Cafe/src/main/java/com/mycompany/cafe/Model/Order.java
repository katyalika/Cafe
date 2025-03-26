/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lihac
 */
public class Order {    
    private ArrayList<Dish> dishes = new ArrayList<>(); 
    private String time;
    
     public Order (){
         this.time = LocalTime.now().toString().substring(0, 8);
     }

    public void addDish(Dish dish) {
        dishes.add(dish);
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
    
    public String getTime() {
        return time;
    }
    
     public List<Dish> getDishes() {
        return new ArrayList<>(dishes);
    }
}
