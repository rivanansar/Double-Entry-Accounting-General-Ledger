/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class paymentCredit {
        private Date tanggal; // Date of the credit transaction
    private double amount; // Amount of the credit

    // Constructor
    public paymentCredit(double amount, Date tanggal) {
        this.amount = amount;
        this.tanggal = tanggal;
    }

    // Method to set the credit amount
    public void setCredit(double amount) {
        this.amount = amount;
    }

    // Method to get the credit amount
    public double getCredit() {
        return amount;
    }
}
