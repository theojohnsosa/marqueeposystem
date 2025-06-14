/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marqueepossystem;

import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author Joana Sosa
 */
public class ReceiptManager {

    public String generateReceipt(DefaultTableModel model, double totalAmount, String paymentMethod, double cashPayment) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("                MARQUEE CINEMAS         \n");
        stringBuilder.append("-----------------------------------------------------------\n");
        stringBuilder.append("Dr. Santos Ave. corner Carlos P. \nGarcia Avenue Extension San Dionisio, \nParanaque City, Philippines\n");
        stringBuilder.append("Contact Us: (+63) 917-876-1111\n\n");

        Random random = new Random();
        String referenceNumber = "000-" + String.format("%09d", random.nextInt(1_000_000_000));
        String receiptNumber = "100-" + String.format("%08d", random.nextInt(100_000_000));
        stringBuilder.append("Reference Number: ").append(referenceNumber).append("\n");
        stringBuilder.append("Receipt Number: ").append(receiptNumber).append("\n");
        stringBuilder.append("-----------------------------------------------------------\n");

        stringBuilder.append("Order Summary:\n");

        appendTableToReceipt(stringBuilder, ShareTableModel.ticketsTableModel);
        appendTableToReceipt(stringBuilder, ShareTableModel.beveragesTableModel);
        appendTableToReceipt(stringBuilder, ShareTableModel.soloSnacksTableModel);
        appendTableToReceipt(stringBuilder, ShareTableModel.comboMealsTableModel);

        stringBuilder.append("\nTotal Amount: ₱").append(String.format("%.2f", ShareTableModel.totalAmount)).append("\n");
        stringBuilder.append("Payment Method: ").append(paymentMethod).append("\n");

        if (paymentMethod.equalsIgnoreCase("Cash")) {
            stringBuilder.append("Amount Tendered: ₱").append(String.format("%.2f", cashPayment)).append("\n");
            stringBuilder.append("Change: ₱").append(String.format("%.2f", ShareTableModel.change)).append("\n");
        }

        stringBuilder.append("-----------------------------------------------------------\n");
        stringBuilder.append("Thank you for choosing Marquee Cinemas!\n");

        return stringBuilder.toString();
    }

    private void appendTableToReceipt(StringBuilder sb, DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            String item = model.getValueAt(i, 0).toString();
            String qty = model.getValueAt(i, 1).toString();
            String price = model.getValueAt(i, 3).toString();
            sb.append(item).append(" x").append(qty).append(" - ").append(price).append("\n");
        }
    }
}