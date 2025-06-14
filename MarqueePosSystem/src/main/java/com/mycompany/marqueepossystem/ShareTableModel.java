/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marqueepossystem;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joana Sosa
 */
public class ShareTableModel {
    public static DefaultTableModel ticketsTableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Name", "Qty", "Each", "Total" }
    );
    
    public static DefaultTableModel beveragesTableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Name", "Qty", "Each", "Total" }
    );
    
    public static DefaultTableModel soloSnacksTableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Name", "Qty", "Each", "Total" }
    );
    
    public static DefaultTableModel comboMealsTableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Name", "Qty", "Each", "Total" }
    );
    
     public static double totalAmount = 0.00;
     public static double change = 0.00;
     public static ArrayList<Object[]> tableData = new ArrayList<>();
}
