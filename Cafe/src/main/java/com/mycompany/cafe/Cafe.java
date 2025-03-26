/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafe;

import com.mycompany.cafe.Model.BaseDish;
import com.mycompany.cafe.Model.Dish;
import com.mycompany.cafe.Model.Order;
import com.mycompany.cafe.Model.modBerries;
import com.mycompany.cafe.Model.modSauce;

/**
 *
 * @author lihac
 */
public class Cafe {

    public static void main(String[] args) {
        Dish stew = new BaseDish();
        Order order = new Order();

        stew = new modSauce(stew);
        stew = new modBerries(stew);
        order.addDish(stew);

        System.out.println(order.getOrderDetails());
    }
}
