/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe.GUI;

import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author lihac
 */
public class DishBinder {
    private ArrayList<JCheckBox> boxes;
    
    public DishBinder () {
        boxes = new ArrayList();
    }
    
    public void addBox(JCheckBox box) {
        boxes.add(box);
    }
}
