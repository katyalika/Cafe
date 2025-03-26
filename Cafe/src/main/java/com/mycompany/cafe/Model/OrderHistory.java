/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lihac
 */
public class OrderHistory {
    public List<Order> orders;

    public OrderHistory() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public void clearHistory() {
        orders.clear();
    }
    
     public void printOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println("Empty history.");
            return;
        }

        System.out.println("=== HISTORY ===");

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.printf("%-5d | %-8s | %-40s | %-10d%n",
                            i + 1,
                            order.getTime(),
                            formatDishes(order),
                            order.getTotalCost());
        }
    }
     
     private String formatDishes(Order order) {
        StringBuilder sb = new StringBuilder();
        for (Dish dish : order.getDishes()) {
            sb.append(dish.getDescription()).append(", ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}
