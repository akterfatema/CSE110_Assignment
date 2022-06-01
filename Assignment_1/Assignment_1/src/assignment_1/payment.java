/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author Fatema
 */
public class payment {
    private double amount;
    private String date;
    private int paymentId;

    public payment() {
    }

    public payment(double amount, String date, int paymentId) {
        this.amount = amount;
        this.date = date;
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public int getPaymentId() {
        return paymentId;
    }
    public void splitBill(){
        System.out.println("Pick your ticket from counter");
    }
    public void conformationEmail(){
        System.out.println("An email has been sent to your email");
    }
}
