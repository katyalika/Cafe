/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafe;

import com.mycompany.cafe.Model.BaseDish;
import com.mycompany.cafe.Model.Dish;
import com.mycompany.cafe.Model.Order;
import com.mycompany.cafe.Model.OrderHistory;
import com.mycompany.cafe.Model.modBerries;
import com.mycompany.cafe.Model.modBread;
import com.mycompany.cafe.Model.modDoubleDeer;
import com.mycompany.cafe.Model.modSauce;

/**
 *
 * @author lihac
 */
public class Cafe {

    public static void main(String[] args) {
        OrderHistory history = new OrderHistory();
        
        
        Order order1 = new Order();
        Dish stew = new BaseDish();
        stew = new modSauce(stew);
        stew = new modBerries(stew);
        order1.addDish(stew);
        history.addOrder(order1);

        System.out.println(order1.getOrderDetails());
        
        Order order2 = new Order();
        Dish stew2 = new BaseDish();
        stew2 = new modDoubleDeer(stew2);
        stew2 = new modBread(stew2);
        order2.addDish(stew2);
        history.addOrder(order2);
        
        history.printOrderHistory();     
    }
}
