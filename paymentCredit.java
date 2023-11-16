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
    private Date tanggal;
    private double amount;

    public paymentCredit(double amount, Date tanggal) {
        this.amount = amount;
        this.tanggal = tanggal;
    }

    public void setCredit(double amount) {
        this.amount = amount;
    }

    public double getCredit() {
        return amount;
    }
}
