/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.Model;

/**
 *
 * @author lihac
 */
 public class BaseDish implements Dish {
     
    @Override
    public String getDescription() {
        return "NordicStew";
    }

    @Override
    public int getCost() {
        return 30;
    }
 }